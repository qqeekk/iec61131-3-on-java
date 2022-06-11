/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AHourlyDays extends PDays
{
    private TInteger _integer_;
    private TDayIdentifier _dayIdentifier_;
    private TUnderscore _underscore_;
    private PHours _hours_;

    public AHourlyDays()
    {
        // Constructor
    }

    public AHourlyDays(
        @SuppressWarnings("hiding") TInteger _integer_,
        @SuppressWarnings("hiding") TDayIdentifier _dayIdentifier_,
        @SuppressWarnings("hiding") TUnderscore _underscore_,
        @SuppressWarnings("hiding") PHours _hours_)
    {
        // Constructor
        setInteger(_integer_);

        setDayIdentifier(_dayIdentifier_);

        setUnderscore(_underscore_);

        setHours(_hours_);

    }

    @Override
    public Object clone()
    {
        return new AHourlyDays(
            cloneNode(this._integer_),
            cloneNode(this._dayIdentifier_),
            cloneNode(this._underscore_),
            cloneNode(this._hours_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAHourlyDays(this);
    }

    public TInteger getInteger()
    {
        return this._integer_;
    }

    public void setInteger(TInteger node)
    {
        if(this._integer_ != null)
        {
            this._integer_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._integer_ = node;
    }

    public TDayIdentifier getDayIdentifier()
    {
        return this._dayIdentifier_;
    }

    public void setDayIdentifier(TDayIdentifier node)
    {
        if(this._dayIdentifier_ != null)
        {
            this._dayIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dayIdentifier_ = node;
    }

    public TUnderscore getUnderscore()
    {
        return this._underscore_;
    }

    public void setUnderscore(TUnderscore node)
    {
        if(this._underscore_ != null)
        {
            this._underscore_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._underscore_ = node;
    }

    public PHours getHours()
    {
        return this._hours_;
    }

    public void setHours(PHours node)
    {
        if(this._hours_ != null)
        {
            this._hours_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._hours_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._integer_)
            + toString(this._dayIdentifier_)
            + toString(this._underscore_)
            + toString(this._hours_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._integer_ == child)
        {
            this._integer_ = null;
            return;
        }

        if(this._dayIdentifier_ == child)
        {
            this._dayIdentifier_ = null;
            return;
        }

        if(this._underscore_ == child)
        {
            this._underscore_ = null;
            return;
        }

        if(this._hours_ == child)
        {
            this._hours_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._integer_ == oldChild)
        {
            setInteger((TInteger) newChild);
            return;
        }

        if(this._dayIdentifier_ == oldChild)
        {
            setDayIdentifier((TDayIdentifier) newChild);
            return;
        }

        if(this._underscore_ == oldChild)
        {
            setUnderscore((TUnderscore) newChild);
            return;
        }

        if(this._hours_ == oldChild)
        {
            setHours((PHours) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
