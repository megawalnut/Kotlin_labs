package com.example.lab_1_2;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView;
class UsrAdapter(private val users: List<User>) :
    RecyclerView.Adapter<UsrAdapter.UserViewHolder>() {

    class UserViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val fullName: TextView = itemView.findViewById(R.id.textFullName);
        val birthDate: TextView = itemView.findViewById(R.id.textFullDate);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users[position]

        holder.fullName.text = user.fullName
        holder.birthDate.text = user.birthDate
    }

    override fun getItemCount(): Int = users.size
}