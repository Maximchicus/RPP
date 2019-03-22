package com.example.lab1_1;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class ListAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return 1000000;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mItemText;
        private ImageView mItemImage;

        public ListViewHolder(View itemView) {
            super(itemView);
            mItemText = (TextView) itemView.findViewById(R.id.pic_text);
            mItemImage = (ImageView) itemView.findViewById(R.id.pic);
            itemView.setOnClickListener(this);
        }

        public void bindView(int position) {
            Random random = new Random();
            String num = "";
            mItemText.setText(convert(position+1, num));
            mItemImage.setImageResource(MyData.picturePath[random.nextInt(97)]);
            if (position % 2 == 1)
                itemView.setBackgroundColor(Color.parseColor("#CCCCCC"));
            else
                itemView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        private String convert(int num, String name){
            if(num<=19){
                switch (num){
                    case 1:
                        name += "один (одна)";
                        return name;
                    case 2:
                        name += "два (две)";
                        return name;
                    case 3:
                        name += "три";
                        return name;
                    case 4:
                        name += "четыре";
                        return name;
                    case 5:
                        name += "пять";
                        return name;
                    case 6:
                        name += "шесть";
                        return name;
                    case 7:
                        name += "семь";
                        return name;
                    case 8:
                        name += "восемь";
                        return name;
                    case 9:
                        name += "девять";
                        return name;
                    case 0:
                        return name;
                    case 10:
                        name += "десять";
                        return name;
                    case 11:
                        name += "одинадцать";
                        return name;
                    case 12:
                        name += "двенадцать";
                        return name;
                    case 13:
                        name += "тринадцать";
                        return name;
                    case 14:
                        name += "четырнадцать";
                        return name;
                    case 15:
                        name += "пятнадцать";
                        return name;
                    case 16:
                        name += "шестандцать";
                        return name;
                    case 17:
                        name += "семнадцать";
                        return name;
                    case 18:
                        name += "восемнадцать";
                        return name;
                    case 19:
                        name += "девятнадцать";
                        return name;
                }
            }
            else if (num < 100) {
                int des = num - (num%10);
                switch(des){
                    case 20:
                        name = name + "двадцать ";
                        return convert(num%10, name);
                    case 30:
                        name = name + "тридцать ";
                        return convert(num%10, name);
                    case 40:
                        name+= "сорок ";
                        return convert(num%10, name);
                    case 50:
                        name+= "пятьдесят ";
                        return convert(num%10, name);
                    case 60:
                        name+= "шестьдесят ";
                        return convert(num%10, name);
                    case 70:
                        name+= "семьдесят ";
                        return convert(num%10, name);
                    case 80:
                        name+= "восемьдесят ";
                        return convert(num%10, name);
                    case 90:
                        name+= "девяносто ";
                        return convert(num%10, name);
                }
            }
            else if (num < 1000){
                int sot = num - (num%100);
                switch(sot){
                    case 100:
                        name+= "сто ";
                        return convert(num%100, name);
                    case 200:
                        name+= "двести ";
                        return convert(num%100, name);
                    case 300:
                        name+= "триcта ";
                        return convert(num%100, name);
                    case 400:
                        name+= "четыреста ";
                        return convert(num%100, name);
                    case 500:
                        name+= "пятьсот ";
                        return convert(num%100, name);
                    case 600:
                        name+= "шестьсот ";
                        return convert(num%100, name);
                    case 700:
                        name+= "семьсот ";
                        return convert(num%100, name);
                    case 800:
                        name+= "восемьсот ";
                        return convert(num%100, name);
                    case 900:
                        name+= "девятьсот ";
                        return convert(num%100, name);
                }
            }
            else if(num<1000000){
                int tys = num/1000;
                String tysName = convert(tys, name) + " тыс. ";
                return convert(num%1000, tysName);
            }
            else {
                return "миллион";
            }
            return "";
        }

        public void onClick(View view ) {

        }
    }
}
