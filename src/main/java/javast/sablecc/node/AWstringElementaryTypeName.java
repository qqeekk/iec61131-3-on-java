/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AWstringElementaryTypeName extends PElementaryTypeName
{
    private TWstringTypeName _wstringTypeName_;

    public AWstringElementaryTypeName()
    {
        // Constructor
    }

    public AWstringElementaryTypeName(
        @SuppressWarnings("hiding") TWstringTypeName _wstringTypeName_)
    {
        // Constructor
        setWstringTypeName(_wstringTypeName_);

    }

    @Override
    public Object clone()
    {
        return new AWstringElementaryTypeName(
            cloneNode(this._wstringTypeName_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWstringElementaryTypeName(this);
    }

    public TWstringTypeName getWstringTypeName()
    {
        return this._wstringTypeName_;
    }

    public void setWstringTypeName(TWstringTypeName node)
    {
        if(this._wstringTypeName_ != null)
        {
            this._wstringTypeName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._wstringTypeName_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._wstringTypeName_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._wstringTypeName_ == child)
        {
            this._wstringTypeName_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._wstringTypeName_ == oldChild)
        {
            setWstringTypeName((TWstringTypeName) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
