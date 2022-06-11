/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import java.util.*;
import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AStatementList extends PStatementList
{
    private final LinkedList<PStatementListHead> _statementListHead_ = new LinkedList<PStatementListHead>();

    public AStatementList()
    {
        // Constructor
    }

    public AStatementList(
        @SuppressWarnings("hiding") List<?> _statementListHead_)
    {
        // Constructor
        setStatementListHead(_statementListHead_);

    }

    @Override
    public Object clone()
    {
        return new AStatementList(
            cloneList(this._statementListHead_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStatementList(this);
    }

    public LinkedList<PStatementListHead> getStatementListHead()
    {
        return this._statementListHead_;
    }

    public void setStatementListHead(List<?> list)
    {
        for(PStatementListHead e : this._statementListHead_)
        {
            e.parent(null);
        }
        this._statementListHead_.clear();

        for(Object obj_e : list)
        {
            PStatementListHead e = (PStatementListHead) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._statementListHead_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._statementListHead_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._statementListHead_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PStatementListHead> i = this._statementListHead_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PStatementListHead) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}