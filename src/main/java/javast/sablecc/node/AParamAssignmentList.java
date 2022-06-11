/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import java.util.*;
import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AParamAssignmentList extends PParamAssignmentList
{
    private final LinkedList<PParamAssignmentListHead> _paramAssignmentListHead_ = new LinkedList<PParamAssignmentListHead>();
    private PParamAssignment _paramAssignment_;

    public AParamAssignmentList()
    {
        // Constructor
    }

    public AParamAssignmentList(
        @SuppressWarnings("hiding") List<?> _paramAssignmentListHead_,
        @SuppressWarnings("hiding") PParamAssignment _paramAssignment_)
    {
        // Constructor
        setParamAssignmentListHead(_paramAssignmentListHead_);

        setParamAssignment(_paramAssignment_);

    }

    @Override
    public Object clone()
    {
        return new AParamAssignmentList(
            cloneList(this._paramAssignmentListHead_),
            cloneNode(this._paramAssignment_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParamAssignmentList(this);
    }

    public LinkedList<PParamAssignmentListHead> getParamAssignmentListHead()
    {
        return this._paramAssignmentListHead_;
    }

    public void setParamAssignmentListHead(List<?> list)
    {
        for(PParamAssignmentListHead e : this._paramAssignmentListHead_)
        {
            e.parent(null);
        }
        this._paramAssignmentListHead_.clear();

        for(Object obj_e : list)
        {
            PParamAssignmentListHead e = (PParamAssignmentListHead) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._paramAssignmentListHead_.add(e);
        }
    }

    public PParamAssignment getParamAssignment()
    {
        return this._paramAssignment_;
    }

    public void setParamAssignment(PParamAssignment node)
    {
        if(this._paramAssignment_ != null)
        {
            this._paramAssignment_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._paramAssignment_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._paramAssignmentListHead_)
            + toString(this._paramAssignment_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._paramAssignmentListHead_.remove(child))
        {
            return;
        }

        if(this._paramAssignment_ == child)
        {
            this._paramAssignment_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PParamAssignmentListHead> i = this._paramAssignmentListHead_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParamAssignmentListHead) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._paramAssignment_ == oldChild)
        {
            setParamAssignment((PParamAssignment) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}