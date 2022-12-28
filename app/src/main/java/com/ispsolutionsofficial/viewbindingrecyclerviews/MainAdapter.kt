package com.ispsolutionsofficial.viewbindingrecyclerviews

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ispsolutionsofficial.viewbindingrecyclerviews.databinding.RecyclerviewItemBinding

class MainAdapter(val taskList: List<Task>): RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    inner class MainViewHolder(val itemBinding: RecyclerviewItemBinding): RecyclerView.ViewHolder(itemBinding.root) {
        fun bindItem(task:Task) {
            itemBinding.tvTitle.text = task.title
            itemBinding.tvTime.text = task.timeStamp
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return  MainViewHolder(RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val task: Task = taskList[position]
        holder.bindItem(task)
    }

    override fun getItemCount(): Int {
        return taskList.size
    }
}