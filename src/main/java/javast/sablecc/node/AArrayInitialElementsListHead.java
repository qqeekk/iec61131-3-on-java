/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AArrayInitialElementsListHead extends PArrayInitialElementsListHead
{
    private PArrayInitialElements _arrayInitialElements_;
    private TComma _comma_;

    public AArrayInitialElementsListHead()
    {
        // Constructor
    }

    public AArrayInitialElementsListHead(
        @SuppressWarnings("hiding") PArrayInitialElements _arrayInitialElements_,
        @SuppressWarnings("hiding") TComma _comma_)
    {
        // Constructor
        setArrayInitialElements(_arrayInitialElements_);

        setComma(_comma_);

    }

    @Override
    public Object clone()
    {
        return new AArrayInitialElementsListHead(
            cloneNode(this._arrayInitialElements_),
            cloneNode(this._comma_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayInitialElementsListHead(this);
    }

    public PArrayInitialElements getArrayInitialElements()
    {
        return this._arrayInitialElements_;
    }

    public void setArrayInitialElements(PArrayInitialElements node)
    {
        if(this._arrayInitialElements_ != null)
        {
            this._arrayInitialElements_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arrayInitialElements_ = node;
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._arrayInitialElements_)
            + toString(this._comma_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._arrayInitialElements_ == child)
        {
            this._arrayInitialElements_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._arrayInitialElements_ == oldChild)
        {
            setArrayInitialElements((PArrayInitialElements) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
