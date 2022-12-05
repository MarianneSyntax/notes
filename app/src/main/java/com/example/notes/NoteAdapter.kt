package com.example.notes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.notes.data.Repository
import com.example.notes.data.model.Note
import com.example.notes.ui.main.MainFragmentDirections

class NoteAdapter: RecyclerView.Adapter<NoteAdapter.ItemViewHolder>() {
    var dataset = Repository().loadNotes()

    inner class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.note_title)
        val body: TextView = itemView.findViewById(R.id.note_body)
        val dateCreated: TextView = itemView.findViewById(R.id.note_created)
        val dateEdited: TextView = itemView.findViewById(R.id.note_edited)
        val noteCard: CardView = itemView.findViewById(R.id.note_card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.note_item, parent, false)

        return ItemViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.title.text = dataset[position].title
        holder.body.text = dataset[position].body

        holder.noteCard.setOnClickListener {
            holder.itemView.findNavController().navigate(MainFragmentDirections.actionMainFragmentToNoteFragment(position))
        }

    }

    override fun getItemCount(): Int {
       return dataset.size
    }

    fun submitList(newList: MutableList<Note>) {
        dataset = newList
        notifyDataSetChanged()
    }
}