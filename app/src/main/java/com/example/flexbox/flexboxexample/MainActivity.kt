package com.example.flexbox.flexboxexample

import com.example.flexbox.flexboxexample.databinding.ActivityMainBinding
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.flexbox.flexboxexample.databinding.ItemTagBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        // 糖質の少ない食品
        val keywords = arrayListOf("こんにゃく", "エリスリトール", "大豆製品（豆腐, 湯葉, 油揚げ, 納豆など）", "枝豆", "無調整豆乳", "アーモンド", "杏仁", "カシューナッツ", "くるみ", "けし", "ごま", "ピスタチオ", "ピーナッツ", "マカダミアナッツ", "オクラ", "かぶ", "カリフラワー", "キャベツ", "キュウリ", "小松菜", "ごぼう", "大根", "タケノコ", "玉ねぎ", "チンゲン菜", "トマト", "なす", "にら", "にんじん", "にんにく", "ねぎ", "白菜", "パプリカ", "ピーマン", "ふき", "ブロッコリー", "ホウレン草", "もやし", "レタス", "アボカド", "きのこ類", "魚", "肉", "卵", "チーズ", "生クリーム", "バター", "牛乳", "ウイスキー", "ウォッカ", "焼酎", "ジン", "ラム", "ワイン（甘口は要注意）", "コーヒー", "紅茶", "日本茶", "ウーロン茶", "プーアル茶", "ジャスミン茶", "コーラゼロ", "こしょう", "塩", "しょうゆ", "酢", "白みそ以外のみそ", "マヨネーズ","こんにゃく", "エリスリトール", "大豆", "大豆製品（豆腐", "湯葉", "油揚げ", "納豆など）", "枝豆", "無調整豆乳", "アーモンド", "杏仁", "カシューナッツ", "くるみ", "けし", "ごま", "ピスタチオ", "ピーナッツ", "マカダミアナッツ", "オクラ", "かぶ", "カリフラワー", "キャベツ", "キュウリ", "小松菜", "ごぼう", "大根", "タケノコ", "玉ねぎ", "チンゲン菜", "トマト", "なす", "にら", "にんじん", "にんにく", "ねぎ", "白菜", "パプリカ", "ピーマン", "ふき", "ブロッコリー", "ホウレン草", "もやし", "レタス", "アボカド", "きのこ類", "魚", "肉", "卵", "チーズ", "生クリーム", "バター", "牛乳", "ウイスキー", "ウォッカ", "焼酎", "ジン", "ラム", "ワイン（甘口は要注意）", "コーヒー", "紅茶", "日本茶", "ウーロン茶", "プーアル茶", "ジャスミン茶", "コーラゼロ", "こしょう", "塩", "しょうゆ", "酢", "白みそ以外のみそ", "マヨネーズ","こんにゃく", "エリスリトール", "大豆", "大豆製品（豆腐", "湯葉", "油揚げ", "納豆など）", "枝豆", "無調整豆乳", "アーモンド", "杏仁", "カシューナッツ", "くるみ", "けし", "ごま", "ピスタチオ", "ピーナッツ", "マカダミアナッツ")

        keywords.forEach {
            val itemTagBinding = DataBindingUtil.inflate<ItemTagBinding>(LayoutInflater.from(this), R.layout.item_tag, binding.flex, true)
            itemTagBinding.txt.text = it
        }

    }
}
