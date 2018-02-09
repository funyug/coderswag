package net.blockchaind.coderswag.Services

import net.blockchaind.coderswag.Model.Category
import net.blockchaind.coderswag.Model.Product

/**
 * Created by shiva on 2/9/2018.
 */
object DataService {
    val categories = listOf(
            Category("SHIRTS","shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("Digital","digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie","18$","hat1"),
            Product("Devslopes Hat Black","11$","hat2"),
            Product("Devslopes Hat White","14$","hat3"),
            Product("Devslopes Hat Yellow","16$","hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Graphic Hoodie","11$","hoodie1"),
            Product("Devslopes Hoodie Black","11$","hoodie2"),
            Product("Devslopes Hoodie White","14$","hoodie3"),
            Product("Devslopes Hoodie Yellow","16$","hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Graphic shirt","11$","shirt1"),
            Product("Devslopes shirt Black","11$","shirt2"),
            Product("Devslopes shirt White","14$","shirt3"),
            Product("Devslopes shirt Yellow","16$","shirt4"),
            Product("Devslopes shirt Tag","16$","shirt5")
    )

    val digitalgoods = listOf<Product>()

    fun getProducts(category:String) : List<Product> {
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalgoods
        }
    }

}