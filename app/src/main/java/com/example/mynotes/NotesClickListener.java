package com.example.mynotes;

import androidx.cardview.widget.CardView;

import com.example.mynotes.Database.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
