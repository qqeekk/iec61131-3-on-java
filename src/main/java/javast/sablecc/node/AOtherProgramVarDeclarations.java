/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AOtherProgramVarDeclarations extends PProgramVarDeclarations
{
    private POtherVarDeclarations _otherVarDeclarations_;

    public AOtherProgramVarDeclarations()
    {
        // Constructor
    }

    public AOtherProgramVarDeclarations(
        @SuppressWarnings("hiding") POtherVarDeclarations _otherVarDeclarations_)
    {
        // Constructor
        setOtherVarDeclarations(_otherVarDeclarations_);

    }

    @Override
    public Object clone()
    {
        return new AOtherProgramVarDeclarations(
            cloneNode(this._otherVarDeclarations_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOtherProgramVarDeclarations(this);
    }

    public POtherVarDeclarations getOtherVarDeclarations()
    {
        return this._otherVarDeclarations_;
    }

    public void setOtherVarDeclarations(POtherVarDeclarations node)
    {
        if(this._otherVarDeclarations_ != null)
        {
            this._otherVarDeclarations_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._otherVarDeclarations_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._otherVarDeclarations_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._otherVarDeclarations_ == child)
        {
            this._otherVarDeclarations_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._otherVarDeclarations_ == oldChild)
        {
            setOtherVarDeclarations((POtherVarDeclarations) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
