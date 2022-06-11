/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ASingleByteStringSpecInitialization extends PSingleByteStringSpecInitialization
{
    private TColonEq _colonEq_;
    private TSingleByteCharacterString _singleByteCharacterString_;

    public ASingleByteStringSpecInitialization()
    {
        // Constructor
    }

    public ASingleByteStringSpecInitialization(
        @SuppressWarnings("hiding") TColonEq _colonEq_,
        @SuppressWarnings("hiding") TSingleByteCharacterString _singleByteCharacterString_)
    {
        // Constructor
        setColonEq(_colonEq_);

        setSingleByteCharacterString(_singleByteCharacterString_);

    }

    @Override
    public Object clone()
    {
        return new ASingleByteStringSpecInitialization(
            cloneNode(this._colonEq_),
            cloneNode(this._singleByteCharacterString_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASingleByteStringSpecInitialization(this);
    }

    public TColonEq getColonEq()
    {
        return this._colonEq_;
    }

    public void setColonEq(TColonEq node)
    {
        if(this._colonEq_ != null)
        {
            this._colonEq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colonEq_ = node;
    }

    public TSingleByteCharacterString getSingleByteCharacterString()
    {
        return this._singleByteCharacterString_;
    }

    public void setSingleByteCharacterString(TSingleByteCharacterString node)
    {
        if(this._singleByteCharacterString_ != null)
        {
            this._singleByteCharacterString_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._singleByteCharacterString_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._colonEq_)
            + toString(this._singleByteCharacterString_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._colonEq_ == child)
        {
            this._colonEq_ = null;
            return;
        }

        if(this._singleByteCharacterString_ == child)
        {
            this._singleByteCharacterString_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._colonEq_ == oldChild)
        {
            setColonEq((TColonEq) newChild);
            return;
        }

        if(this._singleByteCharacterString_ == oldChild)
        {
            setSingleByteCharacterString((TSingleByteCharacterString) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
