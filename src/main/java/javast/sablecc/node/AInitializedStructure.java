/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AInitializedStructure extends PInitializedStructure
{
    private PStructureTypeName _structureTypeName_;
    private PInitializedStructureInitialization _initializedStructureInitialization_;

    public AInitializedStructure()
    {
        // Constructor
    }

    public AInitializedStructure(
        @SuppressWarnings("hiding") PStructureTypeName _structureTypeName_,
        @SuppressWarnings("hiding") PInitializedStructureInitialization _initializedStructureInitialization_)
    {
        // Constructor
        setStructureTypeName(_structureTypeName_);

        setInitializedStructureInitialization(_initializedStructureInitialization_);

    }

    @Override
    public Object clone()
    {
        return new AInitializedStructure(
            cloneNode(this._structureTypeName_),
            cloneNode(this._initializedStructureInitialization_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInitializedStructure(this);
    }

    public PStructureTypeName getStructureTypeName()
    {
        return this._structureTypeName_;
    }

    public void setStructureTypeName(PStructureTypeName node)
    {
        if(this._structureTypeName_ != null)
        {
            this._structureTypeName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._structureTypeName_ = node;
    }

    public PInitializedStructureInitialization getInitializedStructureInitialization()
    {
        return this._initializedStructureInitialization_;
    }

    public void setInitializedStructureInitialization(PInitializedStructureInitialization node)
    {
        if(this._initializedStructureInitialization_ != null)
        {
            this._initializedStructureInitialization_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._initializedStructureInitialization_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._structureTypeName_)
            + toString(this._initializedStructureInitialization_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._structureTypeName_ == child)
        {
            this._structureTypeName_ = null;
            return;
        }

        if(this._initializedStructureInitialization_ == child)
        {
            this._initializedStructureInitialization_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._structureTypeName_ == oldChild)
        {
            setStructureTypeName((PStructureTypeName) newChild);
            return;
        }

        if(this._initializedStructureInitialization_ == oldChild)
        {
            setInitializedStructureInitialization((PInitializedStructureInitialization) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}