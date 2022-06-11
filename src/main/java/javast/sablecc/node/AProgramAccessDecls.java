/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AProgramAccessDecls extends PProgramAccessDecls
{
    private TVarAccessToken _varAccessToken_;
    private PProgramAccessDeclList _programAccessDeclList_;
    private TEndVarToken _endVarToken_;

    public AProgramAccessDecls()
    {
        // Constructor
    }

    public AProgramAccessDecls(
        @SuppressWarnings("hiding") TVarAccessToken _varAccessToken_,
        @SuppressWarnings("hiding") PProgramAccessDeclList _programAccessDeclList_,
        @SuppressWarnings("hiding") TEndVarToken _endVarToken_)
    {
        // Constructor
        setVarAccessToken(_varAccessToken_);

        setProgramAccessDeclList(_programAccessDeclList_);

        setEndVarToken(_endVarToken_);

    }

    @Override
    public Object clone()
    {
        return new AProgramAccessDecls(
            cloneNode(this._varAccessToken_),
            cloneNode(this._programAccessDeclList_),
            cloneNode(this._endVarToken_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProgramAccessDecls(this);
    }

    public TVarAccessToken getVarAccessToken()
    {
        return this._varAccessToken_;
    }

    public void setVarAccessToken(TVarAccessToken node)
    {
        if(this._varAccessToken_ != null)
        {
            this._varAccessToken_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._varAccessToken_ = node;
    }

    public PProgramAccessDeclList getProgramAccessDeclList()
    {
        return this._programAccessDeclList_;
    }

    public void setProgramAccessDeclList(PProgramAccessDeclList node)
    {
        if(this._programAccessDeclList_ != null)
        {
            this._programAccessDeclList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._programAccessDeclList_ = node;
    }

    public TEndVarToken getEndVarToken()
    {
        return this._endVarToken_;
    }

    public void setEndVarToken(TEndVarToken node)
    {
        if(this._endVarToken_ != null)
        {
            this._endVarToken_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._endVarToken_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._varAccessToken_)
            + toString(this._programAccessDeclList_)
            + toString(this._endVarToken_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._varAccessToken_ == child)
        {
            this._varAccessToken_ = null;
            return;
        }

        if(this._programAccessDeclList_ == child)
        {
            this._programAccessDeclList_ = null;
            return;
        }

        if(this._endVarToken_ == child)
        {
            this._endVarToken_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._varAccessToken_ == oldChild)
        {
            setVarAccessToken((TVarAccessToken) newChild);
            return;
        }

        if(this._programAccessDeclList_ == oldChild)
        {
            setProgramAccessDeclList((PProgramAccessDeclList) newChild);
            return;
        }

        if(this._endVarToken_ == oldChild)
        {
            setEndVarToken((TEndVarToken) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
