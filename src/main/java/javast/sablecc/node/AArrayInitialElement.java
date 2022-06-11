/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AArrayInitialElement extends PInitialElement
{
    private PArrayInitialization _arrayInitialization_;

    public AArrayInitialElement()
    {
        // Constructor
    }

    public AArrayInitialElement(
        @SuppressWarnings("hiding") PArrayInitialization _arrayInitialization_)
    {
        // Constructor
        setArrayInitialization(_arrayInitialization_);

    }

    @Override
    public Object clone()
    {
        return new AArrayInitialElement(
            cloneNode(this._arrayInitialization_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayInitialElement(this);
    }

    public PArrayInitialization getArrayInitialization()
    {
        return this._arrayInitialization_;
    }

    public void setArrayInitialization(PArrayInitialization node)
    {
        if(this._arrayInitialization_ != null)
        {
            this._arrayInitialization_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arrayInitialization_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._arrayInitialization_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._arrayInitialization_ == child)
        {
            this._arrayInitialization_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._arrayInitialization_ == oldChild)
        {
            setArrayInitialization((PArrayInitialization) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}