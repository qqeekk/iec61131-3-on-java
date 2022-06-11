/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AProgramLibraryElementDeclaration extends PLibraryElementDeclaration
{
    private PProgramDeclaration _programDeclaration_;

    public AProgramLibraryElementDeclaration()
    {
        // Constructor
    }

    public AProgramLibraryElementDeclaration(
        @SuppressWarnings("hiding") PProgramDeclaration _programDeclaration_)
    {
        // Constructor
        setProgramDeclaration(_programDeclaration_);

    }

    @Override
    public Object clone()
    {
        return new AProgramLibraryElementDeclaration(
            cloneNode(this._programDeclaration_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProgramLibraryElementDeclaration(this);
    }

    public PProgramDeclaration getProgramDeclaration()
    {
        return this._programDeclaration_;
    }

    public void setProgramDeclaration(PProgramDeclaration node)
    {
        if(this._programDeclaration_ != null)
        {
            this._programDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._programDeclaration_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._programDeclaration_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._programDeclaration_ == child)
        {
            this._programDeclaration_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._programDeclaration_ == oldChild)
        {
            setProgramDeclaration((PProgramDeclaration) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
