/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AVarInitDeclsHead extends PVarInitDeclsHead
{
    private PVarInitDecl _varInitDecl_;
    private TSemicolon _semicolon_;

    public AVarInitDeclsHead()
    {
        // Constructor
    }

    public AVarInitDeclsHead(
        @SuppressWarnings("hiding") PVarInitDecl _varInitDecl_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setVarInitDecl(_varInitDecl_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AVarInitDeclsHead(
            cloneNode(this._varInitDecl_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVarInitDeclsHead(this);
    }

    public PVarInitDecl getVarInitDecl()
    {
        return this._varInitDecl_;
    }

    public void setVarInitDecl(PVarInitDecl node)
    {
        if(this._varInitDecl_ != null)
        {
            this._varInitDecl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._varInitDecl_ = node;
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
            + toString(this._varInitDecl_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._varInitDecl_ == child)
        {
            this._varInitDecl_ = null;
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
        if(this._varInitDecl_ == oldChild)
        {
            setVarInitDecl((PVarInitDecl) newChild);
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
