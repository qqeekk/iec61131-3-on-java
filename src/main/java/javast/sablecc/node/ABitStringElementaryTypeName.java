/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ABitStringElementaryTypeName extends PElementaryTypeName
{
    private TBitStringTypeName _bitStringTypeName_;
    private TEdge _edge_;

    public ABitStringElementaryTypeName()
    {
        // Constructor
    }

    public ABitStringElementaryTypeName(
        @SuppressWarnings("hiding") TBitStringTypeName _bitStringTypeName_,
        @SuppressWarnings("hiding") TEdge _edge_)
    {
        // Constructor
        setBitStringTypeName(_bitStringTypeName_);

        setEdge(_edge_);

    }

    @Override
    public Object clone()
    {
        return new ABitStringElementaryTypeName(
            cloneNode(this._bitStringTypeName_),
            cloneNode(this._edge_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABitStringElementaryTypeName(this);
    }

    public TBitStringTypeName getBitStringTypeName()
    {
        return this._bitStringTypeName_;
    }

    public void setBitStringTypeName(TBitStringTypeName node)
    {
        if(this._bitStringTypeName_ != null)
        {
            this._bitStringTypeName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bitStringTypeName_ = node;
    }

    public TEdge getEdge()
    {
        return this._edge_;
    }

    public void setEdge(TEdge node)
    {
        if(this._edge_ != null)
        {
            this._edge_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._edge_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._bitStringTypeName_)
            + toString(this._edge_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._bitStringTypeName_ == child)
        {
            this._bitStringTypeName_ = null;
            return;
        }

        if(this._edge_ == child)
        {
            this._edge_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._bitStringTypeName_ == oldChild)
        {
            setBitStringTypeName((TBitStringTypeName) newChild);
            return;
        }

        if(this._edge_ == oldChild)
        {
            setEdge((TEdge) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}