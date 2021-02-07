package com.example.dailynoteapp.listener;

import com.example.dailynoteapp.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
