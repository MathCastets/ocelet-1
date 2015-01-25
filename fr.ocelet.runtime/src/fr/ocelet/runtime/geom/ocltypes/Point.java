package fr.ocelet.runtime.geom.ocltypes;

import org.geotools.geometry.jts.JTS;
import org.opengis.geometry.MismatchedDimensionException;
import org.opengis.referencing.operation.MathTransform;
import org.opengis.referencing.operation.TransformException;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.CoordinateSequence;
import com.vividsolutions.jts.geom.CoordinateSequenceComparator;
import com.vividsolutions.jts.geom.Envelope;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.util.Assert;

import fr.ocelet.runtime.geom.SpatialManager;

/**
 * Simple punctual geometry
 * @author Pascal Degenne - Initial contribution
 *
 */
@SuppressWarnings("serial")
public class Point extends com.vividsolutions.jts.geom.Point {

	static final String ERR_HEADER = "Point : ";
	protected CoordinateSequence coordinates;

	/**
	 * Constructor used by the GeometryFactory
	 * 
	 * @param coordinates
	 *            contains the single coordinate on which to base this
	 *            <code>Point</code> , or <code>null</code> to create the empty
	 *            geometry.
	 */
	public Point(CoordinateSequence coordinates, GeometryFactory factory) {
		super(coordinates, factory);
		init(coordinates);
	}

	public Point() {
		super(SpatialManager.geometryFactory().getCoordinateSequenceFactory()
				.create(new Coordinate[] { new Coordinate(0, 0) }),
				SpatialManager.geometryFactory());
		init(null);
	}

	/**
	 * Static simple constructor
	 * @param xpos
	 * @param ypos
	 * @return A new initialized Point
	 */
	public static Point xy(Double xpos, Double ypos) {
		Point p = new Point();
		p.setX(xpos);
		p.setY(ypos);
		return p;
	}

	/**
	 * Static simple constructor
	 * @param xpos
	 * @param ypos
	 * @param zpos
	 * @return A new initialized Point
	 */
	public static Point xyz(Double xpos, Double ypos, Double zpos) {
		Point p = new Point();
		p.setX(xpos);
		p.setY(ypos);
		p.setZ(zpos);
		return p;
	}

	
	protected void init(CoordinateSequence coordinates) {
		if (coordinates == null) {
			coordinates = getFactory().getCoordinateSequenceFactory().create(
					new Coordinate[] { new Coordinate(0, 0) });
		}
		Assert.isTrue(coordinates.size() <= 1);
		this.coordinates = coordinates;
	}

	public void setX(double x) {
		coordinates.setOrdinate(0, CoordinateSequence.X, x);
	}

	public void setY(double y) {
		coordinates.setOrdinate(0, CoordinateSequence.Y, y);
	}

	public void setZ(double z) {
		coordinates.setOrdinate(0, CoordinateSequence.Z, z);
	}

	@Override
	public Coordinate getCoordinate() {
		return coordinates.size() != 0 ? coordinates.getCoordinate(0) : null;
	}

	@Override
	protected Envelope computeEnvelopeInternal() {
		if (isEmpty()) {
			return new Envelope();
		}
		Envelope env = new Envelope();
		env.expandToInclude(coordinates.getX(0), coordinates.getY(0));
		return env;
	}

	/**
	 * Creates and returns a full copy of this {@link Point} object. (including
	 * all coordinates contained by it).
	 * 
	 * @return a clone of this instance
	 */
	@Override
	public Object clone() {
		Point p = (Point) super.clone();
		p.coordinates = (CoordinateSequence) coordinates.clone();
		return p;// return the clone
	}

	@Override
	protected int compareToSameClass(Object other,
			CoordinateSequenceComparator comp) {
		Point point = (Point) other;
		return comp.compare(this.coordinates, point.coordinates);
	}

	@Override
	public CoordinateSequence getCoordinateSequence() {
		return coordinates;
	}

	public Point transform(MathTransform mt) {
		if (mt != null)
			try {
				return (Point) JTS.transform(this, mt);
			} catch (MismatchedDimensionException e) {
				System.out
						.println(ERR_HEADER
								+ "Mismatched dimensions when trying to transform coordinates to a new coordinates system.");
			} catch (TransformException e) {
				System.out
						.println(ERR_HEADER
								+ "Transformation error when trying to transform coordinates to a new coordinates system.");
			}
		return this;
	}

}
