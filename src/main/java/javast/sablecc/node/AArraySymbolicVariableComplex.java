/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AArraySymbolicVariableComplex extends PSymbolicVariableComplex
{
    private PSymbolicVariable _symbolicVariable_;
    private PSubscriptList _subscriptList_;

    public AArraySymbolicVariableComplex()
    {
        // Constructor
    }

    public AArraySymbolicVariableComplex(
        @SuppressWarnings("hiding") PSymbolicVariable _symbolicVariable_,
        @SuppressWarnings("hiding") PSubscriptList _subscriptList_)
    {
        // Constructor
        setSymbolicVariable(_symbolicVariable_);

        setSubscriptList(_subscriptList_);

    }

    @Override
    public Object clone()
    {
        return new AArraySymbolicVariableComplex(
            cloneNode(this._symbolicVariable_),
            cloneNode(this._subscriptList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArraySymbolicVariableComplex(this);
    }

    public PSymbolicVariable getSymbolicVariable()
    {
        return this._symbolicVariable_;
    }

    public void setSymbolicVariable(PSymbolicVariable node)
    {
        if(this._symbolicVariable_ != null)
        {
            this._symbolicVariable_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._symbolicVariable_ = node;
    }

    public PSubscriptList getSubscriptList()
    {
        return this._subscriptList_;
    }

    public void setSubscriptList(PSubscriptList node)
    {
        if(this._subscriptList_ != null)
        {
            this._subscriptList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._subscriptList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._symbolicVariable_)
            + toString(this._subscriptList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._symbolicVariable_ == child)
        {
            this._symbolicVariable_ = null;
            return;
        }

        if(this._subscriptList_ == child)
        {
            this._subscriptList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._symbolicVariable_ == oldChild)
        {
            setSymbolicVariable((PSymbolicVariable) newChild);
            return;
        }

        if(this._subscriptList_ == oldChild)
        {
            setSubscriptList((PSubscriptList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
