/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleStructureElementInit extends PStructureElementInit
{
    private PSimpleSpecInit _simpleSpecInit_;

    public ASimpleStructureElementInit()
    {
        // Constructor
    }

    public ASimpleStructureElementInit(
        @SuppressWarnings("hiding") PSimpleSpecInit _simpleSpecInit_)
    {
        // Constructor
        setSimpleSpecInit(_simpleSpecInit_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleStructureElementInit(
            cloneNode(this._simpleSpecInit_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleStructureElementInit(this);
    }

    public PSimpleSpecInit getSimpleSpecInit()
    {
        return this._simpleSpecInit_;
    }

    public void setSimpleSpecInit(PSimpleSpecInit node)
    {
        if(this._simpleSpecInit_ != null)
        {
            this._simpleSpecInit_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._simpleSpecInit_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._simpleSpecInit_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._simpleSpecInit_ == child)
        {
            this._simpleSpecInit_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._simpleSpecInit_ == oldChild)
        {
            setSimpleSpecInit((PSimpleSpecInit) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}