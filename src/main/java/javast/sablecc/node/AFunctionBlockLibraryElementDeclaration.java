/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AFunctionBlockLibraryElementDeclaration extends PLibraryElementDeclaration
{
    private PFunctionBlockDeclaration _functionBlockDeclaration_;

    public AFunctionBlockLibraryElementDeclaration()
    {
        // Constructor
    }

    public AFunctionBlockLibraryElementDeclaration(
        @SuppressWarnings("hiding") PFunctionBlockDeclaration _functionBlockDeclaration_)
    {
        // Constructor
        setFunctionBlockDeclaration(_functionBlockDeclaration_);

    }

    @Override
    public Object clone()
    {
        return new AFunctionBlockLibraryElementDeclaration(
            cloneNode(this._functionBlockDeclaration_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunctionBlockLibraryElementDeclaration(this);
    }

    public PFunctionBlockDeclaration getFunctionBlockDeclaration()
    {
        return this._functionBlockDeclaration_;
    }

    public void setFunctionBlockDeclaration(PFunctionBlockDeclaration node)
    {
        if(this._functionBlockDeclaration_ != null)
        {
            this._functionBlockDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._functionBlockDeclaration_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._functionBlockDeclaration_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._functionBlockDeclaration_ == child)
        {
            this._functionBlockDeclaration_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._functionBlockDeclaration_ == oldChild)
        {
            setFunctionBlockDeclaration((PFunctionBlockDeclaration) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
