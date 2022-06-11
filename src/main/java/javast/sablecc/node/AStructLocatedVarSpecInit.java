/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AStructLocatedVarSpecInit extends PLocatedVarSpecInit
{
    private PInitializedStructure _initializedStructure_;

    public AStructLocatedVarSpecInit()
    {
        // Constructor
    }

    public AStructLocatedVarSpecInit(
        @SuppressWarnings("hiding") PInitializedStructure _initializedStructure_)
    {
        // Constructor
        setInitializedStructure(_initializedStructure_);

    }

    @Override
    public Object clone()
    {
        return new AStructLocatedVarSpecInit(
            cloneNode(this._initializedStructure_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStructLocatedVarSpecInit(this);
    }

    public PInitializedStructure getInitializedStructure()
    {
        return this._initializedStructure_;
    }

    public void setInitializedStructure(PInitializedStructure node)
    {
        if(this._initializedStructure_ != null)
        {
            this._initializedStructure_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._initializedStructure_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._initializedStructure_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._initializedStructure_ == child)
        {
            this._initializedStructure_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._initializedStructure_ == oldChild)
        {
            setInitializedStructure((PInitializedStructure) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
