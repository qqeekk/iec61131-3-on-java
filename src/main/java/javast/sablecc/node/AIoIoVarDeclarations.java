/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AIoIoVarDeclarations extends PIoVarDeclarations
{
    private PInputOutputDeclarations _inputOutputDeclarations_;

    public AIoIoVarDeclarations()
    {
        // Constructor
    }

    public AIoIoVarDeclarations(
        @SuppressWarnings("hiding") PInputOutputDeclarations _inputOutputDeclarations_)
    {
        // Constructor
        setInputOutputDeclarations(_inputOutputDeclarations_);

    }

    @Override
    public Object clone()
    {
        return new AIoIoVarDeclarations(
            cloneNode(this._inputOutputDeclarations_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIoIoVarDeclarations(this);
    }

    public PInputOutputDeclarations getInputOutputDeclarations()
    {
        return this._inputOutputDeclarations_;
    }

    public void setInputOutputDeclarations(PInputOutputDeclarations node)
    {
        if(this._inputOutputDeclarations_ != null)
        {
            this._inputOutputDeclarations_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inputOutputDeclarations_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._inputOutputDeclarations_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._inputOutputDeclarations_ == child)
        {
            this._inputOutputDeclarations_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._inputOutputDeclarations_ == oldChild)
        {
            setInputOutputDeclarations((PInputOutputDeclarations) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}