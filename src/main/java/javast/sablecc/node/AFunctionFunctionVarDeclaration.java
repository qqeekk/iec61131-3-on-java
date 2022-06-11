/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AFunctionFunctionVarDeclaration extends PFunctionVarDeclaration
{
    private PVarDeclarations _varDeclarations_;

    public AFunctionFunctionVarDeclaration()
    {
        // Constructor
    }

    public AFunctionFunctionVarDeclaration(
        @SuppressWarnings("hiding") PVarDeclarations _varDeclarations_)
    {
        // Constructor
        setVarDeclarations(_varDeclarations_);

    }

    @Override
    public Object clone()
    {
        return new AFunctionFunctionVarDeclaration(
            cloneNode(this._varDeclarations_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunctionFunctionVarDeclaration(this);
    }

    public PVarDeclarations getVarDeclarations()
    {
        return this._varDeclarations_;
    }

    public void setVarDeclarations(PVarDeclarations node)
    {
        if(this._varDeclarations_ != null)
        {
            this._varDeclarations_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._varDeclarations_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._varDeclarations_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._varDeclarations_ == child)
        {
            this._varDeclarations_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._varDeclarations_ == oldChild)
        {
            setVarDeclarations((PVarDeclarations) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
