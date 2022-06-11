/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import java.util.*;
import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ASubscriptList extends PSubscriptList
{
    private TLbrack _lbrack_;
    private final LinkedList<PSubscriptListHead> _subscriptListHead_ = new LinkedList<PSubscriptListHead>();
    private PSubscript _subscript_;
    private TRbrack _rbrack_;

    public ASubscriptList()
    {
        // Constructor
    }

    public ASubscriptList(
        @SuppressWarnings("hiding") TLbrack _lbrack_,
        @SuppressWarnings("hiding") List<?> _subscriptListHead_,
        @SuppressWarnings("hiding") PSubscript _subscript_,
        @SuppressWarnings("hiding") TRbrack _rbrack_)
    {
        // Constructor
        setLbrack(_lbrack_);

        setSubscriptListHead(_subscriptListHead_);

        setSubscript(_subscript_);

        setRbrack(_rbrack_);

    }

    @Override
    public Object clone()
    {
        return new ASubscriptList(
            cloneNode(this._lbrack_),
            cloneList(this._subscriptListHead_),
            cloneNode(this._subscript_),
            cloneNode(this._rbrack_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASubscriptList(this);
    }

    public TLbrack getLbrack()
    {
        return this._lbrack_;
    }

    public void setLbrack(TLbrack node)
    {
        if(this._lbrack_ != null)
        {
            this._lbrack_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lbrack_ = node;
    }

    public LinkedList<PSubscriptListHead> getSubscriptListHead()
    {
        return this._subscriptListHead_;
    }

    public void setSubscriptListHead(List<?> list)
    {
        for(PSubscriptListHead e : this._subscriptListHead_)
        {
            e.parent(null);
        }
        this._subscriptListHead_.clear();

        for(Object obj_e : list)
        {
            PSubscriptListHead e = (PSubscriptListHead) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._subscriptListHead_.add(e);
        }
    }

    public PSubscript getSubscript()
    {
        return this._subscript_;
    }

    public void setSubscript(PSubscript node)
    {
        if(this._subscript_ != null)
        {
            this._subscript_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._subscript_ = node;
    }

    public TRbrack getRbrack()
    {
        return this._rbrack_;
    }

    public void setRbrack(TRbrack node)
    {
        if(this._rbrack_ != null)
        {
            this._rbrack_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rbrack_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lbrack_)
            + toString(this._subscriptListHead_)
            + toString(this._subscript_)
            + toString(this._rbrack_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lbrack_ == child)
        {
            this._lbrack_ = null;
            return;
        }

        if(this._subscriptListHead_.remove(child))
        {
            return;
        }

        if(this._subscript_ == child)
        {
            this._subscript_ = null;
            return;
        }

        if(this._rbrack_ == child)
        {
            this._rbrack_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lbrack_ == oldChild)
        {
            setLbrack((TLbrack) newChild);
            return;
        }

        for(ListIterator<PSubscriptListHead> i = this._subscriptListHead_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PSubscriptListHead) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._subscript_ == oldChild)
        {
            setSubscript((PSubscript) newChild);
            return;
        }

        if(this._rbrack_ == oldChild)
        {
            setRbrack((TRbrack) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}