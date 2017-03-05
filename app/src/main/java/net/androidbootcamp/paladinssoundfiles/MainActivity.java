package net.androidbootcamp.paladinssoundfiles;


import android.content.Context;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    MediaPlayer mpChampion;

    Integer[] champions = {R.drawable.androxusicon, R.drawable.barikicon, R.drawable.bombkingicon, R.drawable.buckicon, R.drawable.cassieicon, R.drawable.drogozicon, R.drawable.evieicon, R.drawable.fernandoicon, R.drawable.grohkicon, R.drawable.grovericon, R.drawable.kinessaicon, R.drawable.maeveicon, R.drawable.makoaicon, R.drawable.maldambaicon, R.drawable.pipicon, R.drawable.ruckusicon, R.drawable.shalinicon, R.drawable.skyeicon, R.drawable.championtorvaldicon, R.drawable.tyraicon, R.drawable.viktoricon, R.drawable.yingicon};


    String[] championName = {"Androxus", "Barik", "Bomb King", "Buck", "Cassie", "Drogoz", "Evie", "Fernando", "Grokh", "Grover", "Kinessa", "Maeve", "Makoa", "MalDamba", "Pip", "Ruckus", "Sha Lin", "Skye", "Torvald", "Tyra", "Viktor", "Ying"};


    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView grid = (GridView) findViewById(R.id.gridView);
        //final ImageView pic = (ImageView) findViewById(R.id.imgLarge);
        //assert grid != null;
        grid.setAdapter(new ImageAdapter(this));

        //setListAdapter(new ArrayAdapter<Integer>(this, R.layout.activity_main, R.id.gridview, champions));


        grid.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
                                        @Override
                                        public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                                        {
                                            Toast.makeText(getBaseContext(), "Here is the intro line for: " + championName[position], Toast.LENGTH_SHORT).show();
                                           // pic.setImageResource(champions[position]);
                                            mpChampion = new MediaPlayer();
                                            switch(position)
                                            {
                                                case 0:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.androxusspintro);
                                                    mpChampion.start();
                                                    break;
                                                case 1:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.barikspintro);
                                                    mpChampion.start();
                                                    break;
                                                case 2:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.bombkingspintro);
                                                    mpChampion.start();
                                                    break;
                                                case 3:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.buckspintro);
                                                    mpChampion.start();
                                                    break;
                                                case 4:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.huntressspintro);
                                                    mpChampion.start();
                                                    break;
                                                case 5:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.drogozspintro);
                                                    mpChampion.start();
                                                    break;
                                                case 6:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.eviespintro);
                                                    mpChampion.start();
                                                    break;
                                                case 7:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.fernandospintro);
                                                    mpChampion.start();
                                                    break;
                                                case 8:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.grohkspintro);
                                                    mpChampion.start();
                                                    break;
                                                case 9:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.groverspintro);
                                                    mpChampion.start();
                                                    break;
                                                case 10:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.kinessaspintro);
                                                    mpChampion.start();
                                                    break;
                                                case 11:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.maevespintro);
                                                    mpChampion.start();
                                                    break;
                                                case 12:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.makoaspintro);
                                                    mpChampion.start();
                                                    break;
                                                case 13:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.maldambaspintro);
                                                    mpChampion.start();
                                                    break;
                                                case 14:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.pipspintro);
                                                    mpChampion.start();
                                                    break;
                                                case 15:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.ruckusspintro);
                                                    mpChampion.start();
                                                    break;
                                                case 16:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.shalinspintro);
                                                    mpChampion.start();
                                                    break;
                                                case 17:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.skyespintro);
                                                    mpChampion.start();
                                                    break;
                                                case 18:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.torvaldspintro);
                                                    mpChampion.start();
                                                    break;
                                                case 19:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.tyraspintro);
                                                    mpChampion.start();
                                                    break;
                                                case 20:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.viktorspintro);
                                                    mpChampion.start();
                                                    break;
                                                case 21:
                                                    mpChampion = MediaPlayer.create(MainActivity.this, R.raw.yingspintro);
                                                    mpChampion.start();
                                                    break;

                                            }

                                        }
                                    }

        );
    }

    public class ImageAdapter extends BaseAdapter
    {
        private Context context;

        public ImageAdapter(Context c)
        {
            context = c;

        }

        @Override
        public int getCount()
        {
            return champions.length;

        }

        @Override
        public Object getItem(int position)
        {

            return null;
        }

        @Override
        public long getItemId(int position)
        {

            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            pic = new ImageView(context);
            pic.setImageResource(champions[position]);
            //pic.setScaleType(ImageView.ScaleType.FIT_XY);
            //pic.setLayoutParams(new GridView.LayoutParams(350, 350));
            return pic;
        }
    }
}

