/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AArrayTypeDeclaration extends PArrayTypeDeclaration
{
    private PArrayTypeName _arrayTypeName_;
    private TColon _colon_;
    private PArraySpecInit _arraySpecInit_;

    public AArrayTypeDeclaration()
    {
        // Constructor
    }

    public AArrayTypeDeclaration(
        @SuppressWarnings("hiding") PArrayTypeName _arrayTypeName_,
        @SuppressWarnings("hiding") TColon _colon_,
        @SuppressWarnings("hiding") PArraySpecInit _arraySpecInit_)
    {
        // Constructor
        setArrayTypeName(_arrayTypeName_);

        setColon(_colon_);

        setArraySpecInit(_arraySpecInit_);

    }

    @Override
    public Object clone()
    {
        return new AArrayTypeDeclaration(
            cloneNode(this._arrayTypeName_),
            cloneNode(this._colon_),
            cloneNode(this._arraySpecInit_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayTypeDeclaration(this);
    }

    public PArrayTypeName getArrayTypeName()
    {
        return this._arrayTypeName_;
    }

    public void setArrayTypeName(PArrayTypeName node)
    {
        if(this._arrayTypeName_ != null)
        {
            this._arrayTypeName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arrayTypeName_ = node;
    }

    public TColon getColon()
    {
        return this._colon_;
    }

    public void setColon(TColon node)
    {
        if(this._colon_ != null)
        {
            this._colon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colon_ = node;
    }

    public PArraySpecInit getArraySpecInit()
    {
        return this._arraySpecInit_;
    }

    public void setArraySpecInit(PArraySpecInit node)
    {
        if(this._arraySpecInit_ != null)
        {
            this._arraySpecInit_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arraySpecInit_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._arrayTypeName_)
            + toString(this._colon_)
            + toString(this._arraySpecInit_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._arrayTypeName_ == child)
        {
            this._arrayTypeName_ = null;
            return;
        }

        if(this._colon_ == child)
        {
            this._colon_ = null;
            return;
        }

        if(this._arraySpecInit_ == child)
        {
            this._arraySpecInit_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._arrayTypeName_ == oldChild)
        {
            setArrayTypeName((PArrayTypeName) newChild);
            return;
        }

        if(this._colon_ == oldChild)
        {
            setColon((TColon) newChild);
            return;
        }

        if(this._arraySpecInit_ == oldChild)
        {
            setArraySpecInit((PArraySpecInit) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
