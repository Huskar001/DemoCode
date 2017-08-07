package com.huskar.greendaotest.greendaotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.greenrobot.greendao.query.Query;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private NoteDao noteDao;
    private Query<Note> notesQuery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get the note DAO
        DaoSession daoSession = ((App) getApplication()).getDaoSession();
        noteDao = daoSession.getNoteDao();

        notesQuery = noteDao.queryBuilder().orderAsc(NoteDao.Properties.Text).build();

    }

    private void insert(){
        Note note = new Note();
        note.setText("aaa");
        note.setComment("aaa");
        note.setDate(new Date());
        note.setType(NoteType.TEXT);
        noteDao.insert(note);
    }
}
