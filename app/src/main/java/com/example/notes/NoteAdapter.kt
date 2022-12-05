package com.example.notes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.notes.data.Repository

class NoteAdapter: RecyclerView.Adapter<NoteAdapter.ItemViewHolder>() {
    val dataset = Repository().loadNotes()

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
        holder.dateCreated.text = dataset[position].dateCreated.toString()
        holder.dateEdited.text = dataset[position].dateEdited.toString()

        holder.noteCard.setOnClickListener {
            //TODO: implementieren
        }

    }


    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}