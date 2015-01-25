package fr.ocelet.datafacer.ocltypes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import com.vividsolutions.jts.geom.Geometry;

import de.micromata.opengis.kml.v_2_2_0.ColorMode;
import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.IconStyle;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.Style;
import fr.ocelet.datafacer.Datafacer;
import fr.ocelet.datafacer.KmlFolder;
import fr.ocelet.datafacer.KmlUtils;
import fr.ocelet.runtime.model.AbstractModel;
import fr.ocelet.runtime.ocltypes.Color;
import fr.ocelet.runtime.ocltypes.Date;
import fr.ocelet.runtime.ocltypes.List;

public class KmlExport implements Datafacer {

	private final String ERR_HEADER = "Datafacer KmlExport: ";
	// private final String MAX_HEIGHT_STYLE = "Max_Height_Style";
	private Kml kml;
	private Document doc;
	// private MathTransform mt;
	private KmlFolder defolder; // Default folder in case we need one.
	private HashMap<String, KmlFolder> folders;
	private String filename;

	@Override
	public String getErrHeader() {
		return this.ERR_HEADER;
	}

	public KmlExport(String filename) {
		this.filename = AbstractModel.getBasedir() + File.separator + filename;
		kml = new Kml();
		doc = kml.createAndSetDocument();
		folders = new HashMap<String, KmlFolder>();
	}

	public KmlFolder addFolder(String label, String beginDate, String endDate) {
		KmlFolder kf = new KmlFolder(doc, label, beginDate, endDate);
		folders.put(label, kf);
		return kf;
	}

	public KmlFolder addFolder(String label, Date beginDate, Date endDate) {
		KmlFolder kf = new KmlFolder(doc, label,
				beginDate.toString("yyyy-MM-dd"),
				endDate.toString("yyyy-MM-dd"));
		folders.put(label, kf);
		return kf;
	}

	public void addLabel(double xpos, double ypos, double height,
			String beginDate, String endDate, String name, String description,
			String styleName) {
		getDefaultFolder().addLabel(xpos, ypos, height, beginDate, endDate,
				name, description, styleName);
	}

	public void addLabel(double xpos, double ypos, double height,
			Date beginDate, Date endDate, String name, String description,
			String styleName) {
		getDefaultFolder().addLabel(xpos, ypos, height,
				beginDate.toString("yyyy-MM-dd"),
				endDate.toString("yyyy-MM-dd"), name, description, styleName);
	}

	public void addLabel(String foldname, double xpos, double ypos,
			double height, String beginDate, String endDate, String name,
			String description, String styleName) {
		getFolder(foldname).addLabel(xpos, ypos, height, beginDate, endDate,
				name, description, styleName);
	}

	public void addLabel(String foldname, double xpos, double ypos,
			double height, Date beginDate, Date endDate, String name,
			String description, String styleName) {
		getFolder(foldname).addLabel(xpos, ypos, height,
				beginDate.toString("yyyy-MM-dd"),
				endDate.toString("yyyy-MM-dd"), name, description, styleName);
	}

	public void add3DModel(double xpos, double ypos, double orientation,
			double scale, String beginDate, String endDate, String daefile) {
		getDefaultFolder().add3DModel(xpos, ypos, orientation, scale,
				beginDate, endDate, daefile);
	}

	public void add3DModel(double xpos, double ypos, double orientation,
			double scale, Date beginDate, Date endDate, String daefile) {
		getDefaultFolder().add3DModel(xpos, ypos, orientation, scale,
				beginDate.toString("yyyy-MM-dd"),
				endDate.toString("yyyy-MM-dd"), daefile);
	}

	public void add3DModel(String foldname, double xpos, double ypos,
			double orientation, double scale, String beginDate, String endDate,
			String daefile) {
		getFolder(foldname).add3DModel(xpos, ypos, orientation, scale,
				beginDate, endDate, daefile);
	}

	public void add3DModel(String foldname, double xpos, double ypos,
			double orientation, double scale, Date beginDate, Date endDate,
			String daefile) {
		getFolder(foldname).add3DModel(xpos, ypos, orientation, scale,
				beginDate.toString("yyyy-MM-dd"),
				endDate.toString("yyyy-MM-dd"), daefile);
	}

	public void addGeometry(String label, String beginDate, String endDate,
			Geometry geom, String styleName, double height) {
		getDefaultFolder().addGeometry(label, beginDate, endDate, geom,
				styleName, height);
	}

	public void addGeometry(String label, Date beginDate, Date endDate,
			Geometry geom, String styleName, double height) {
		getDefaultFolder().addGeometry(label, beginDate.toString("yyyy-MM-dd"),
				endDate.toString("yyyy-MM-dd"), geom, styleName, height);
	}

	/**
	 * Adds a geometry to a Kml folder.
	 * 
	 * @param foldname
	 *            Label of the kml folder
	 * @param label
	 *            Label of the geometry legend
	 * @param beginDate
	 *            First date of display.
	 * @param endDate
	 *            End display date.
	 * @param geom
	 *            The geometry to add.
	 * @param styleName
	 *            Name of the drawing style to apply.
	 * @param height
	 *            Altitude or thickness of the geometry (depending of the
	 *            geometry kind).
	 */
	public void addGeometry(String foldname, String label, String beginDate,
			String endDate, Geometry geom, String styleName, double height) {
		getFolder(foldname).addGeometry(label, beginDate, endDate, geom,
				styleName, height);
	}

	public void addGeometry(String foldname, String label, Date beginDate,
			Date endDate, Geometry geom, String styleName, double height) {
		getFolder(foldname).addGeometry(label,
				beginDate.toString("yyyy-MM-dd"),
				endDate.toString("yyyy-MM-dd"), geom, styleName, height);
	}

	/**
	 * Defines a new style to be used with addStyledRecord
	 * 
	 * @param name
	 *            Style name. Must be unique.
	 * @param lineWidth
	 *            Width of the line. A thin line should have a value 1.0.
	 * @param lineColor
	 *            Color of the line in HEX text format : ABGR. Example
	 *            "7FFFFF44" is half transparent yellow.
	 * @param fillColor
	 *            Polygon fill color. HEX text format ABGR also.
	 */
	public void defStyle(String name, double lineWidth, String lineColor,
			String fillColor) {
		Style style = doc.createAndAddStyle().withId(name);
		style.createAndSetLineStyle().withColor(lineColor).withWidth(lineWidth);
		style.createAndSetPolyStyle().withColor(fillColor)
				.withColorMode(ColorMode.NORMAL);
	}

	/**
	 * Defines a new style to be used with addStyledRecord
	 * 
	 * @param name
	 *            Style name. Must be unique.
	 * @param lineWidth
	 *            Width of the line. A thin line should have a value 1.0.
	 * @param lineColor
	 *            Color of the line.
	 * @param fillColor
	 *            Polygon fill color.
	 */
	public void defStyle(String name, double lineWidth, Color lineColor,
			Color fillColor) {
		Style style = doc.createAndAddStyle().withId(name);
		style.createAndSetLineStyle().withColor(kmlColor(lineColor))
				.withWidth(lineWidth);
		style.createAndSetPolyStyle().withColor(kmlColor(fillColor))
				.withColorMode(ColorMode.NORMAL);
	}

	/**
	 * Defines a whole range of styles using a name prefix. There will be as
	 * many styles as Colors found in the color list
	 * 
	 * @param prefix
	 *            String style prefix name. The number of style will be added to
	 *            this prefix starting at 1. Ex : "sty1", "sty2", "sty3", ...
	 * @param linewidth
	 *            Width of the line. A thin line should have a value 1.0.
	 * @param fillColors
	 *            Polygon fill color.
	 * @param lineColorProp
	 *            Proportion used to alter the fillColors to generate the line
	 *            colors. The value of the proportion must be between -1 and +1.
	 *            Negative values will produce darker shades of the fill colors
	 *            while positive values will produces lighter colors.
	 */
	public void defStyleRange(String prefix, Double linewidth,
			List<Color> fillColors, Double lineColorProp) {
		int index = 1;
		for (Color col : fillColors) {
			Color linec = lineColorProp >= 0.0 ? col.lighter(lineColorProp)
					: col.darker(-lineColorProp);
			defStyle(prefix + index, linewidth, linec, col);
			index++;
		}
	}

	/**
	 * Produces a Kml String representation of the Color given in argument
	 * 
	 * @param c
	 *            A Color
	 * @return A String in ABGR Hex text format
	 */
	public String kmlColor(Color c) {
		return KmlUtils.kmlColorRGBA(c.getRed(), c.getGreen(), c.getBlue(),
				c.getAlpha());
	}

	/**
	 * Defines a new IconStyle to be used with addStyledRecord
	 * 
	 * @param name
	 *            Style name. Must be unique.
	 * @param iconFile
	 *            Name of an image (png) file. The path is relative to the
	 *            location where the KML file will be saved.
	 * @param scale
	 *            Scale factor applied to the image. Choose 1.0 if you don't
	 *            know.
	 * @param heading
	 *            Orientation heading of the icon. Should be a value between 0.0
	 *            and 360.0. 0.0 is the normal orientation of the icon. Higher
	 *            numbers apply a clockwise rotation of the icon.
	 */

	public void defIconStyle(String name, String iconFile, double scale,
			double heading) {
		Style style = doc.createAndAddStyle().withId(name);
		IconStyle iconstyle = style.createAndSetIconStyle().withScale(scale)
				.withHeading(heading);
		iconstyle.createAndSetIcon().withHref(iconFile);
	}

	public void saveAsKml() {
		try {
			kml.marshal(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println(ERR_HEADER + "Failed to open " + filename
					+ " for saving.");
		}
	}

	public void saveAsKmz() {
		try {
			kml.marshalAsKmz(filename);
		} catch (IOException e) {
			System.out.println(ERR_HEADER + "Failed to open " + filename
					+ " for saving.");
		}
	}

	protected KmlFolder getDefaultFolder() {
		if (defolder == null) {
			defolder = new KmlFolder(doc, filename);
			folders.put(filename, defolder);
		}
		return defolder;
	}

	protected KmlFolder getFolder(String folname) {
		KmlFolder kf = folders.get(folname);
		if (kf == null) {
			kf = new KmlFolder(doc, folname);
			folders.put(folname, kf);
		}
		return kf;

	}
}
