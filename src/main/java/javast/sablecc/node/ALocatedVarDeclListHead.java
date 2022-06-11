/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ALocatedVarDeclListHead extends PLocatedVarDeclListHead
{
    private PLocatedVarDecl _locatedVarDecl_;
    private TSemicolon _semicolon_;

    public ALocatedVarDeclListHead()
    {
        // Constructor
    }

    public ALocatedVarDeclListHead(
        @SuppressWarnings("hiding") PLocatedVarDecl _locatedVarDecl_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setLocatedVarDecl(_locatedVarDecl_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new ALocatedVarDeclListHead(
            cloneNode(this._locatedVarDecl_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALocatedVarDeclListHead(this);
    }

    public PLocatedVarDecl getLocatedVarDecl()
    {
        return this._locatedVarDecl_;
    }

    public void setLocatedVarDecl(PLocatedVarDecl node)
    {
        if(this._locatedVarDecl_ != null)
        {
            this._locatedVarDecl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._locatedVarDecl_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._locatedVarDecl_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._locatedVarDecl_ == child)
        {
            this._locatedVarDecl_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._locatedVarDecl_ == oldChild)
        {
            setLocatedVarDecl((PLocatedVarDecl) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}