package net.droidlabs.mvvm.recyclerview.binding;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

import net.droidlabs.mvvm.recyclerview.ItemClickListener;
import net.droidlabs.mvvm.recyclerview.adapter.BindingRecyclerViewAdapter;
import net.droidlabs.mvvm.recyclerview.adapter.binder.ItemBinder;

import java.util.Collection;

public class RecyclerViewBindings
{

    @BindingAdapter({"items", "itemViewBinder", "itemClickListener"})
    public static <T> void setItemClickListener(RecyclerView recyclerView, Collection<T> items, ItemBinder<T> itemViewMapper, ItemClickListener itemClickListener) {
        recyclerView.setAdapter(new BindingRecyclerViewAdapter<>(itemViewMapper, items, itemClickListener));
    }
}
