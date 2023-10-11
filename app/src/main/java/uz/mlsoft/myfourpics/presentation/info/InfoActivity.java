package uz.mlsoft.myfourpics.presentation.info;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;

import androidx.appcompat.app.AppCompatActivity;

import uz.mlsoft.myfourpics.R;
import uz.mlsoft.myfourpics.databinding.ActivityInfoBinding;
import uz.mlsoft.myfourpics.presentation.main.MainActivity;

public class InfoActivity extends AppCompatActivity {
    private ActivityInfoBinding binding;
    private String text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.ivBackInfo.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });

        text = "<div>\n" +
                "        <h1>\n" +
                "            4 pics one word app\n" +
                "        </h1>\n" +
                "        \n" +
                "        <ul>\n" +
                "            <li>\n" +
                "                \tThis app was created by a coder girl who studied in Gita academy and there you can check your IQ level .\n" +
                "            </li> \n" +
                "            <li>\n" +
                "                \tWhen you lunch this app, by default you see first question in main screen.\n" +
                "            </li> \n" +
                "            <li>\n" +
                "                \n" +
                "            </li>\n" +
                "            <li>\n" +
                "                \tBy clicking play button you can start a game, and there you should find one word by seeing 4 photos\n" +
                "            </li>\n" +
                "                \n" +
                "            <li>\n" +
                "                \tIf you cannot find correct word, you can give a hand by clicking bulb, however you may lose 20 coins\n" +
                "            </li>\n" +
                "        </ul>\n" +
                "        <div>\n" +
                "            <h3>\n" +
                "                Framework:\n" +
                "            </h3>\n" +
                "            <ul>\n" +
                "                <li>\n" +
                "                    <b>\n" +
                "                        Android Studio\n" +
                "                    </b>\n" +
                "                </li>\n" +
                "                <li>\n" +
                "                    <b>\n" +
                "                        Java\n" +
                "                    </b>\n" +
                "                </li>\n" +
                "                <li>\n" +
                "                    <div>\n" +
                "                        <h3>\n" +
                "                            Used technologies:\n" +
                "                        </h3>\n" +
                "                        <ul>\n" +
                "                            <li>\n" +
                "                                MVP pattern\n" +
                "                            </li>\n" +
                "                            <li>\n" +
                "                                Lottie animation\n" +
                "                            </li>\n" +
                "                            <li>\n" +
                "                                Html editor\n" +
                "                            </li>\n" +
                "                            <li>\n" +
                "                                Custom animations\n" +
                "                            </li>\n" +
                "                        </ul>\n" +
                "                    </div>\n" +
                "                </li>\n" +
                "            </ul>\n" +
                "        </div>\n" +
                "    </div>";


        binding.descriptionText.setText(Html.fromHtml(text, Html.FROM_HTML_MODE_LEGACY));

        binding.contactDev.setPaintFlags(binding.contactDev.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        binding.contactDev.setOnClickListener(v -> {
            gotoLink("https://t.me/astrogirll06");
        });

    }

    private void gotoLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}