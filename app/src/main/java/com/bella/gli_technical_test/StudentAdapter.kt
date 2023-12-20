import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bella.gli_technical_test.R
import com.bella.gli_technical_test.Student

class StudentAdapter(private val studentList: List<Student>) :
    RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    inner class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val profileImageView: ImageView = itemView.findViewById(R.id.profileImageView)
        val addressTextView: TextView = itemView.findViewById(R.id.addressTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.student_item, parent, false)
        return StudentViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val currentItem = studentList[position]
        holder.nameTextView.text = currentItem.name
        holder.addressTextView.text = currentItem.address

        // Load drawable image into ImageView
        holder.profileImageView.setImageResource(currentItem.profilePictureResourceId)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }
}
