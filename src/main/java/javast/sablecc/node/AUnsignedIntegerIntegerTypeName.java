/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AUnsignedIntegerIntegerTypeName extends PIntegerTypeName
{
    private TUnsignedIntegerTypeName _unsignedIntegerTypeName_;

    public AUnsignedIntegerIntegerTypeName()
    {
        // Constructor
    }

    public AUnsignedIntegerIntegerTypeName(
        @SuppressWarnings("hiding") TUnsignedIntegerTypeName _unsignedIntegerTypeName_)
    {
        // Constructor
        setUnsignedIntegerTypeName(_unsignedIntegerTypeName_);

    }

    @Override
    public Object clone()
    {
        return new AUnsignedIntegerIntegerTypeName(
            cloneNode(this._unsignedIntegerTypeName_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnsignedIntegerIntegerTypeName(this);
    }

    public TUnsignedIntegerTypeName getUnsignedIntegerTypeName()
    {
        return this._unsignedIntegerTypeName_;
    }

    public void setUnsignedIntegerTypeName(TUnsignedIntegerTypeName node)
    {
        if(this._unsignedIntegerTypeName_ != null)
        {
            this._unsignedIntegerTypeName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unsignedIntegerTypeName_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._unsignedIntegerTypeName_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._unsignedIntegerTypeName_ == child)
        {
            this._unsignedIntegerTypeName_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._unsignedIntegerTypeName_ == oldChild)
        {
            setUnsignedIntegerTypeName((TUnsignedIntegerTypeName) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}