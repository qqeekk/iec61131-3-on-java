/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AStructureTypeDeclaration extends PStructureTypeDeclaration
{
    private PStructureTypeName _structureTypeName_;
    private TColon _colon_;
    private PStructureSpecification _structureSpecification_;

    public AStructureTypeDeclaration()
    {
        // Constructor
    }

    public AStructureTypeDeclaration(
        @SuppressWarnings("hiding") PStructureTypeName _structureTypeName_,
        @SuppressWarnings("hiding") TColon _colon_,
        @SuppressWarnings("hiding") PStructureSpecification _structureSpecification_)
    {
        // Constructor
        setStructureTypeName(_structureTypeName_);

        setColon(_colon_);

        setStructureSpecification(_structureSpecification_);

    }

    @Override
    public Object clone()
    {
        return new AStructureTypeDeclaration(
            cloneNode(this._structureTypeName_),
            cloneNode(this._colon_),
            cloneNode(this._structureSpecification_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStructureTypeDeclaration(this);
    }

    public PStructureTypeName getStructureTypeName()
    {
        return this._structureTypeName_;
    }

    public void setStructureTypeName(PStructureTypeName node)
    {
        if(this._structureTypeName_ != null)
        {
            this._structureTypeName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._structureTypeName_ = node;
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

    public PStructureSpecification getStructureSpecification()
    {
        return this._structureSpecification_;
    }

    public void setStructureSpecification(PStructureSpecification node)
    {
        if(this._structureSpecification_ != null)
        {
            this._structureSpecification_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._structureSpecification_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._structureTypeName_)
            + toString(this._colon_)
            + toString(this._structureSpecification_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._structureTypeName_ == child)
        {
            this._structureTypeName_ = null;
            return;
        }

        if(this._colon_ == child)
        {
            this._colon_ = null;
            return;
        }

        if(this._structureSpecification_ == child)
        {
            this._structureSpecification_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._structureTypeName_ == oldChild)
        {
            setStructureTypeName((PStructureTypeName) newChild);
            return;
        }

        if(this._colon_ == oldChild)
        {
            setColon((TColon) newChild);
            return;
        }

        if(this._structureSpecification_ == oldChild)
        {
            setStructureSpecification((PStructureSpecification) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}