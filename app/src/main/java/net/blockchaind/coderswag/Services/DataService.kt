package net.blockchaind.coderswag.Services

import net.blockchaind.coderswag.Model.Category
import net.blockchaind.coderswag.Model.Product

/**
 * Created by shiva on 2/9/2018.
 */
object DataService {
    val categories = listOf(
            Category("Shirts","shirtimage"),
            Category("Hoodies","hoodieimage"),
            Category("Hats","hatimage"),
            Category("Digital","digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie","18$","hat01"),
            Product("Devslopes Hat Black","11$","hat02"),
            Product("Devslopes Hat White","14$","hat03"),
            Product("Devslopes Hat Yellow","16$","hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Graphic Hoodie","11$","hoodie01"),
            Product("Devslopes Hoodie Black","11$","hoodie02"),
            Product("Devslopes Hoodie White","14$","hoodie03"),
            Product("Devslopes Hoodie Yellow","16$","hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes Graphic shirt","11$","shirt01"),
            Product("Devslopes shirt Black","11$","shirt02"),
            Product("Devslopes shirt White","14$","shirt03"),
            Product("Devslopes shirt Yellow","16$","shirt04"),
            Product("Devslopes shirt Tag","16$","shirt05")
    )


}