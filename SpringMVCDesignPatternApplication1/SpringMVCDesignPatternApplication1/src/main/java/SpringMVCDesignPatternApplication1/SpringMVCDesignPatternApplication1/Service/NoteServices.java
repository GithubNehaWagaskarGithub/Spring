package SpringMVCDesignPatternApplication1.SpringMVCDesignPatternApplication1.Service;

import SpringMVCDesignPatternApplication1.SpringMVCDesignPatternApplication1.Model.Note;

import java.util.List;

public interface NoteServices {
    public List<Note> getAllNotes();
    public void saveNote(Note n1);
    public Note getNoteById(int id);
    public void deleteNote(int id);
}
