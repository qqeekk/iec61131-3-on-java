/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ABoolTypeNameHashed extends PBoolTypeNameHashed
{
    private TBoolTypeName _boolTypeName_;
    private THash _hash_;

    public ABoolTypeNameHashed()
    {
        // Constructor
    }

    public ABoolTypeNameHashed(
        @SuppressWarnings("hiding") TBoolTypeName _boolTypeName_,
        @SuppressWarnings("hiding") THash _hash_)
    {
        // Constructor
        setBoolTypeName(_boolTypeName_);

        setHash(_hash_);

    }

    @Override
    public Object clone()
    {
        return new ABoolTypeNameHashed(
            cloneNode(this._boolTypeName_),
            cloneNode(this._hash_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABoolTypeNameHashed(this);
    }

    public TBoolTypeName getBoolTypeName()
    {
        return this._boolTypeName_;
    }

    public void setBoolTypeName(TBoolTypeName node)
    {
        if(this._boolTypeName_ != null)
        {
            this._boolTypeName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._boolTypeName_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._boolTypeName_)
            + toString(this._hash_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._boolTypeName_ == child)
        {
            this._boolTypeName_ = null;
            return;
        }

        if(this._hash_ == child)
        {
            this._hash_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._boolTypeName_ == oldChild)
        {
            setBoolTypeName((TBoolTypeName) newChild);
            return;
        }

        if(this._hash_ == oldChild)
        {
            setHash((THash) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}