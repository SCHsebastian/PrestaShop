package es.mercaelche.prestashop.utils.recyclers;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import es.mercaelche.prestashop.db.retrofit.standard.product;
import es.mercaelche.prestashop.db.retrofit.standard.products;

public class ProductsRecycler extends RecyclerView.Adapter<ProductsRecycler.ViewHolder> {

    private OnItemClickListener mListener;

    public ProductsRecycler(products productos) {
        for (product producto: productos.getProduct()) {
            producto.getName();
            producto.getId_default_image().getHref();
            producto.getPrice();
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
        void onItemLongClick(View view, int position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
