/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AElementaryReturnTypeName extends PReturnTypeName
{
    private PElementaryTypeName _elementaryTypeName_;

    public AElementaryReturnTypeName()
    {
        // Constructor
    }

    public AElementaryReturnTypeName(
        @SuppressWarnings("hiding") PElementaryTypeName _elementaryTypeName_)
    {
        // Constructor
        setElementaryTypeName(_elementaryTypeName_);

    }

    @Override
    public Object clone()
    {
        return new AElementaryReturnTypeName(
            cloneNode(this._elementaryTypeName_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAElementaryReturnTypeName(this);
    }

    public PElementaryTypeName getElementaryTypeName()
    {
        return this._elementaryTypeName_;
    }

    public void setElementaryTypeName(PElementaryTypeName node)
    {
        if(this._elementaryTypeName_ != null)
        {
            this._elementaryTypeName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elementaryTypeName_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._elementaryTypeName_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._elementaryTypeName_ == child)
        {
            this._elementaryTypeName_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._elementaryTypeName_ == oldChild)
        {
            setElementaryTypeName((PElementaryTypeName) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
