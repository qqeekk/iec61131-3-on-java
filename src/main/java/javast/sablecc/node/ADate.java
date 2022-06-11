/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ADate extends PDate
{
    private TDateTypeNameFull _dateTypeNameFull_;
    private THash _hash_;
    private PDateLiteral _dateLiteral_;

    public ADate()
    {
        // Constructor
    }

    public ADate(
        @SuppressWarnings("hiding") TDateTypeNameFull _dateTypeNameFull_,
        @SuppressWarnings("hiding") THash _hash_,
        @SuppressWarnings("hiding") PDateLiteral _dateLiteral_)
    {
        // Constructor
        setDateTypeNameFull(_dateTypeNameFull_);

        setHash(_hash_);

        setDateLiteral(_dateLiteral_);

    }

    @Override
    public Object clone()
    {
        return new ADate(
            cloneNode(this._dateTypeNameFull_),
            cloneNode(this._hash_),
            cloneNode(this._dateLiteral_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADate(this);
    }

    public TDateTypeNameFull getDateTypeNameFull()
    {
        return this._dateTypeNameFull_;
    }

    public void setDateTypeNameFull(TDateTypeNameFull node)
    {
        if(this._dateTypeNameFull_ != null)
        {
            this._dateTypeNameFull_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dateTypeNameFull_ = node;
    }

    public THash getHash()
    {
        return this._hash_;
    }

    public void setHash(THash node)
    {
        if(this._hash_ != null)
        {
            this._hash_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._hash_ = node;
    }

    public PDateLiteral getDateLiteral()
    {
        return this._dateLiteral_;
    }

    public void setDateLiteral(PDateLiteral node)
    {
        if(this._dateLiteral_ != null)
        {
            this._dateLiteral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dateLiteral_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._dateTypeNameFull_)
            + toString(this._hash_)
            + toString(this._dateLiteral_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._dateTypeNameFull_ == child)
        {
            this._dateTypeNameFull_ = null;
            return;
        }

        if(this._hash_ == child)
        {
            this._hash_ = null;
            return;
        }

        if(this._dateLiteral_ == child)
        {
            this._dateLiteral_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._dateTypeNameFull_ == oldChild)
        {
            setDateTypeNameFull((TDateTypeNameFull) newChild);
            return;
        }

        if(this._hash_ == oldChild)
        {
            setHash((THash) newChild);
            return;
        }

        if(this._dateLiteral_ == oldChild)
        {
            setDateLiteral((PDateLiteral) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
