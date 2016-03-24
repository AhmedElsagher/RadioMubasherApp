package com.example.sagher.radiomubasher;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EventListActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Event> mEvents;
    private static String LOG_TAG = "EventListActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        getDataSet();
        mAdapter = new MyRecyclerViewAdapter();
        mRecyclerView.setAdapter(mAdapter);

    }

    public void getDataSet() {
        mEvents=new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            mEvents.add(new Event("Towards Media", "any description"));
        }
    }

    private class MyRecyclerViewAdapter extends
            RecyclerView.Adapter<EventHolder> {


        @Override
        public EventHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).
                    inflate(R.layout.event_card_row, parent, false);

            return new EventHolder(view);
        }

        @Override
        public void onBindViewHolder(EventHolder holder, int position) {
            Event event = mEvents.get(position);
            holder.eventTitle.setText(event.getName());

        }

        @Override
        public int getItemCount() {
            return mEvents.size();
        }
    }

    public class EventHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        public ImageView eventImage;
        public TextView eventTitle;
        public TextView eventDate;
        public CardView eventCard;

        public EventHolder(View view) {
            super(view);
            view.setOnClickListener(this);
            //define widgets of the card
            eventCard = (CardView) itemView.findViewById(R.id.event_card_view);
            eventDate = (TextView) view.findViewById(R.id.event_card_date);
            eventTitle = (TextView) view.findViewById(R.id.event_card_name);
            eventImage = (ImageView) view.findViewById(R.id.event_card_image);

        }

        @Override
        public void onClick(View v) {
            if (v == eventCard) {
                //intent to event Activity
            }
        }
    }
}
