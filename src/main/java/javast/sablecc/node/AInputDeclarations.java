/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AInputDeclarations extends PInputDeclarations
{
    private TVarInputToken _varInputToken_;
    private TRetain _retain_;
    private PVarInitDecls _varInitDecls_;
    private TEndVarToken _endVarToken_;

    public AInputDeclarations()
    {
        // Constructor
    }

    public AInputDeclarations(
        @SuppressWarnings("hiding") TVarInputToken _varInputToken_,
        @SuppressWarnings("hiding") TRetain _retain_,
        @SuppressWarnings("hiding") PVarInitDecls _varInitDecls_,
        @SuppressWarnings("hiding") TEndVarToken _endVarToken_)
    {
        // Constructor
        setVarInputToken(_varInputToken_);

        setRetain(_retain_);

        setVarInitDecls(_varInitDecls_);

        setEndVarToken(_endVarToken_);

    }

    @Override
    public Object clone()
    {
        return new AInputDeclarations(
            cloneNode(this._varInputToken_),
            cloneNode(this._retain_),
            cloneNode(this._varInitDecls_),
            cloneNode(this._endVarToken_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInputDeclarations(this);
    }

    public TVarInputToken getVarInputToken()
    {
        return this._varInputToken_;
    }

    public void setVarInputToken(TVarInputToken node)
    {
        if(this._varInputToken_ != null)
        {
            this._varInputToken_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._varInputToken_ = node;
    }

    public TRetain getRetain()
    {
        return this._retain_;
    }

    public void setRetain(TRetain node)
    {
        if(this._retain_ != null)
        {
            this._retain_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._retain_ = node;
    }

    public PVarInitDecls getVarInitDecls()
    {
        return this._varInitDecls_;
    }

    public void setVarInitDecls(PVarInitDecls node)
    {
        if(this._varInitDecls_ != null)
        {
            this._varInitDecls_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._varInitDecls_ = node;
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
            + toString(this._varInputToken_)
            + toString(this._retain_)
            + toString(this._varInitDecls_)
            + toString(this._endVarToken_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._varInputToken_ == child)
        {
            this._varInputToken_ = null;
            return;
        }

        if(this._retain_ == child)
        {
            this._retain_ = null;
            return;
        }

        if(this._varInitDecls_ == child)
        {
            this._varInitDecls_ = null;
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
        if(this._varInputToken_ == oldChild)
        {
            setVarInputToken((TVarInputToken) newChild);
            return;
        }

        if(this._retain_ == oldChild)
        {
            setRetain((TRetain) newChild);
            return;
        }

        if(this._varInitDecls_ == oldChild)
        {
            setVarInitDecls((PVarInitDecls) newChild);
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
