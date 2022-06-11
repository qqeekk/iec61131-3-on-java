/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import java.util.*;
import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ACaseList extends PCaseList
{
    private final LinkedList<PCaseListHead> _caseListHead_ = new LinkedList<PCaseListHead>();
    private PCaseListElement _caseListElement_;

    public ACaseList()
    {
        // Constructor
    }

    public ACaseList(
        @SuppressWarnings("hiding") List<?> _caseListHead_,
        @SuppressWarnings("hiding") PCaseListElement _caseListElement_)
    {
        // Constructor
        setCaseListHead(_caseListHead_);

        setCaseListElement(_caseListElement_);

    }

    @Override
    public Object clone()
    {
        return new ACaseList(
            cloneList(this._caseListHead_),
            cloneNode(this._caseListElement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACaseList(this);
    }

    public LinkedList<PCaseListHead> getCaseListHead()
    {
        return this._caseListHead_;
    }

    public void setCaseListHead(List<?> list)
    {
        for(PCaseListHead e : this._caseListHead_)
        {
            e.parent(null);
        }
        this._caseListHead_.clear();

        for(Object obj_e : list)
        {
            PCaseListHead e = (PCaseListHead) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._caseListHead_.add(e);
        }
    }

    public PCaseListElement getCaseListElement()
    {
        return this._caseListElement_;
    }

    public void setCaseListElement(PCaseListElement node)
    {
        if(this._caseListElement_ != null)
        {
            this._caseListElement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._caseListElement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._caseListHead_)
            + toString(this._caseListElement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._caseListHead_.remove(child))
        {
            return;
        }

        if(this._caseListElement_ == child)
        {
            this._caseListElement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PCaseListHead> i = this._caseListHead_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PCaseListHead) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._caseListElement_ == oldChild)
        {
            setCaseListElement((PCaseListElement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
