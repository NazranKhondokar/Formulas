package com.example.nazran.formulas;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;


public class English extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
        ExpandableListView elv = (ExpandableListView) findViewById(R.id.physicsListView);
        elv.setAdapter(new ExpandableListAdapter());

    }

    public class ExpandableListAdapter extends BaseExpandableListAdapter {

        private String[] groups = {
                "Right Form of Verbs",
                "Tag Question",
                "Voice Change",
                "Narration",
                "Completing Sentences",
                "Preposition"
        };

        private String[][] children = {
                {
                        "RULE 1: Singular Subject=Singular Verb, Plural Subject=Plural verb",
                        "RULE 2: Preposition (in,at,on,of,for,from,by,with,without,before,after,into,across,about)+noun or Verb +ing .",
                        "RULE 3: To +Verb1   but   (Addicted to, Adverse to, Be used to, With a view to, Look forward to, Get used to, Be accustomed to)+ Verb+ing.",
                        "RULE 4: Verb+article+Adverb+adjective+noun.",
                        "RULE 5: A , An , The +noun.  The+noun or verb+ing+of.",
                        "RULE 7: While+Verb+ing",
                        "RULE 8: (have, has, had, get, got, getting, having )+V3 or Adjective",
                        "RULE 9: Passive Voice -(Can be, could be, may be , might be, Shall be, should be, will be, would be, must be, used to be, have to be,  ought to be )+ V3",
                        "RULE 10: I = am ,(He, She, It) = is ,(We, They, you ) = are 3rd person Singular Sub. = Has 3rd person Plural Sub. = Have"
                },
                {
                        "1. We use Auxiliary Verbs to make a sentence Negative of Interrogative. So, To make a tag question we use Auxiliary Verbs . They are different in different tenses.",
                        "2. We also use Modal Verbs as Auxiliary verbs. Some Modal Verbs are can, could, will, would, shall, should, need to, ought to, dare to,  etc.",
                        "3. Always a question is formed with the help of Auxiliary Verb. If the sentence is affirmative, Tag question is negative.",
                        "4. We say ‘let us’ to express proposal but say let me, let him, let them to express request.",
                        "5. When main verb is Have, Has, Need, you should use do/does as auxiliary verb in present tense and did in Past Tense.",
                        "6. If subject is plural, the pronoun of subject is always ‘They’",
                        "7. When Subject is nobody, everybody, none, everyone, the pronoun can be ‘Anybody’ or  ‘They’",
                        "8. The words ‘seldom, rare, hardly, few, little, scarcely, no sooner are negative.  Then question tag should be affirmative."
                },
                {
                        "Identify the subject, the verb and the object: SVO",
                        "Change the object into subject",
                        "Put the suitable helping verb or auxiliary verb. In case helping verb is given, use the same. But note that the helping verb given agrees with the object.",
                        "Change the verb into past participle of the verb.",
                        "Add the preposition \"by\"",
                        "Change the subject into object."
                },
                {
                        "1. If the reporting verb is in the present or future tense, the tense in the reported speech is not changed.",
                        "2. If the reporting verb is in the past tense, the verb in the reported speech is changed into the corresponding past form.",
                        "3. If the reporting verb is in the past tense, and the verb of the reported speech is in the past indefinite tense, it (the verb in the reported speech) is changed into the past perfect tense.",
                        "4. If the reporting verb is in the past tense, and the verb in the reported speech is in the past continuous, it (the verb in the reported speech) is changed into the past perfect continuous tense.",
                        "5. If the Direct Speech describes a universal truth, constant fact, habitual fact, geographical fact and quotations, the verb in the reported speech remains unchanged",
                        "6. The First Person of the direct speech is changed into the person the man spoken to and the third person does not have any change",
                        "7. If the Reported speech has two or more verbs occurring at the same time, the past tense of the verbs is not changed",
                        "8. Words that express nearness are often changed into the words expressing remoteness"
                },
                {
                        "Rule 1: It is time + for + personal object + to + verb (present form) + ……….",
                        "Rule 2: It is time + subject + verb (past form) + ………",
                        "Rule 3: Present Indefinite + as if/as though + past indefinite.",
                        "Rule 4: Past Indefinite + as if/as though + past perfect.",
                        "Rule 5: If + Present Indefinite + future indefinite tense.",
                        "Rule 6: If + Past Indefinite + would/could + verb (present form).",
                        "Rule 7: If + Past Perfect + would have/could have + verb (past participle form).",
                        "Rule 8: Had + Verb + Past Participle Form + would have/could have + verb (past participle form).",
                        "Rule 9: If + Subject + were + would + verb (present form).",
                        "Rule 10: Present/Future Indefinite Tense + when/after + present perfect."
                },
                {
                        "Rule 1. A preposition generally, but not always, goes before its noun or pronoun. One of the undying myths of English grammar is that you may not end a sentence with a preposition. But look at the first example that follows. No one should feel compelled to say, or even write, That is something with which I cannot agree. Just do not use extra prepositions when the meaning is clear without them.",
                        "Rule 2a. The preposition like means \"similar to\" or \"similarly to.\" It should be followed by an object of the preposition (noun, pronoun, noun phrase), not by a subject and verb. Rule of thumb: Avoid like when a verb is involved.",
                        "Rule 2b. Instead of like, use as, as if, as though, or the way when following a comparison with a subject and verb.",
                        "Rule 3. The preposition of should never be used in place of the helping verb have.",
                        "Rule 4. Follow different with the preposition from. Things differ from other things; avoid different than.",
                        "Rule 5. Use into rather than in to express motion toward something. Use in to tell the location."
                }
        };

        @Override
        public int getGroupCount() {
            return groups.length;
        }

        @Override
        public int getChildrenCount(int i) {
            return children[i].length;
        }

        @Override
        public Object getGroup(int i) {
            return groups[i];
        }

        @Override
        public Object getChild(int i, int i1) {
            return children[i][i1];
        }

        @Override
        public long getGroupId(int i) {
            return i;
        }

        @Override
        public long getChildId(int i, int i1) {
            return i1;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

        @Override
        public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(English.this);
            textView.setText(getGroup(i).toString());
            textView.setBackgroundColor(Color.parseColor("#66BB6A"));
            textView.setTextColor(Color.WHITE);
            textView.setGravity(Gravity.CENTER);
            textView.setTextSize(24);
            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(English.this);
            textView.setText(getChild(i, i1).toString());
            textView.setTextColor(Color.BLACK);
            textView.setTextSize(20);
            return textView;
        }

        @Override
        public boolean isChildSelectable(int i, int i1) {
            return true;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_physics, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
