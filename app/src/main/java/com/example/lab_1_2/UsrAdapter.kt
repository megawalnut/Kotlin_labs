package com.example.lab_1_2;

import android.widget.ImageView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.appcompat.widget.SwitchCompat
import androidx.recyclerview.widget.RecyclerView;
class UsrAdapter(private val users: List<User>) :
    RecyclerView.Adapter<UsrAdapter.UserViewHolder>() {

    class UserViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val avatar: ImageView = itemView.findViewById(R.id.avatar);
        val login: EditText = itemView.findViewById(R.id.editLogin);
        val passwd: EditText = itemView.findViewById(R.id.editPassword);
        val fullName: EditText = itemView.findViewById(R.id.editFullName);
        val birthDate: EditText = itemView.findViewById(R.id.editBirthDate);
        val sex: SwitchCompat = itemView.findViewById(R.id.switchMW);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_helloact, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users[position]

        holder.login.setText(user.login)
        holder.passwd.setText(user.passwd)
        holder.fullName.setText(user.fullName)
        holder.birthDate.setText(user.birthDate)

        holder.sex.isChecked = user.sex == "М"

//        holder.login.addTextChangedListener {
//            user.login = it.toString()
//        }
//        holder.passwd.addTextChangedListener {
//            user.passwd = it.toString()
//        }
//        holder.fullName.addTextChangedListener {
//            user.fullName = it.toString()
//        }
//        holder.birthDate.addTextChangedListener {
//            user.birthDate = it.toString()
//        }
//
//        holder.sex.setOnCheckedChangeListener { _, isChecked ->
//            user.sex = if (isChecked) "М" else "Ж"
//        }
    }

    override fun getItemCount(): Int = users.size
}