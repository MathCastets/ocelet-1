// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CompleteIteratorCell.java

package fr.ocelet.runtime.relation.impl;

import fr.ocelet.runtime.ocltypes.List;
import fr.ocelet.runtime.raster.CellAggregOperator;
import fr.ocelet.runtime.relation.*;

import java.util.Iterator;

// Referenced classes of package fr.ocelet.runtime.relation.impl:
//            CellGraph

public class CompleteIteratorCell<E extends OcltEdge, Ro extends OcltRole> implements Iterator<E> {

   

	 protected CellGraph<E, Ro> cellGraph;
	    protected E cursorEdge;

    public CompleteIteratorCell(E cursorEdge, CellGraph<E, Ro> cellGraph)
    {
        this.cursorEdge = cursorEdge;
        this.cellGraph = cellGraph;
    }

    public void setGraph(CellGraph<E, Ro> cellGraph)
    {
        this.cellGraph = cellGraph;
    }

    public boolean hasNext()
    {
        return ((CursorEdge)cursorEdge).hasNext();
    }

    public E next(){
    
        ((CursorEdge)cursorEdge).next();
        return cursorEdge;
    }

    public void remove()
    {
    }
public void setAggregOpDouble(String name, AggregOperator<Double, List<Double>> agg, boolean val){
        ((CursorEdge)cursorEdge).setAggregOpDouble(name, agg, val);

    }
public void setAggregOpInteger(String name, AggregOperator<Integer, List<Integer>> agg, boolean val){
        ((CursorEdge)cursorEdge).setAggregOpInteger(name, agg, val);

    }

public void setAggregOpFloat(String name, AggregOperator<Float, List<Float>> agg, boolean val){
        ((CursorEdge)cursorEdge).setAggregOpFloat(name, agg, val);
    }

public void setAggregOpByte(String name, AggregOperator<Byte, List<Byte>> agg, boolean val){
        ((CursorEdge)cursorEdge).setAggregOpByte(name, agg, val);
    }

public void setAggregOpBoolean(String name, AggregOperator<Boolean, List<Boolean>> agg, boolean val){
        ((CursorEdge)cursorEdge).setAggregOpBoolean(name, agg, val);
    }
   /* public void setAggregOp(String name, AggregOperator agg, boolean val)
    {
        ((CursorEdge)cursorEdge).setAggregOp(name, agg, val);
    }*/

    public void setCellOperator(CellAggregOperator operator)
    {
        ((CursorEdge)cursorEdge).setCellOperator(operator);
    }

    public void cleanOperator()
    {
        ((CursorEdge)cursorEdge).cleanOperator();
    }

    public E getEdge()
    {
        return cursorEdge;
    }
   
    public void extendedMoore(int n){
    	((CursorEdge)cursorEdge).extendedMoore(n);
    }
     public void extendedCircularMoore(int n){
    	((CursorEdge)cursorEdge).extendedCircularMoore(n);
    }
    
    public void setCellShapeType(String type){
    	((CursorEdge)cursorEdge).setCursorType(type);
    	((CursorEdge)cursorEdge).updateCellType();
    }

    
    

   
}
