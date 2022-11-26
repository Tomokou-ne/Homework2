package ObjectsMethods;

import java.util.Objects;
public class Author {
        private String authorLastName;
        private String authorName;
        public Author(String authorName, String authorLastName) {
            this.authorName = authorName;
            this.authorLastName = authorLastName;
        }
        public String getAuthorName() {
            return authorName;
        }
        public String getAuthorLastName() {
            return authorLastName;
        }
        @Override
        public String toString() {
            return "автор: " + authorName + " " + authorLastName;
        }
        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            if (other == null || this.getClass() != other.getClass()) return false;
            Author author = (Author) other;
            return Objects.equals(authorLastName, author.authorLastName);
        }
        @Override
        public int hashCode() {
        return java.util.Objects.hash(authorName, authorLastName);
        }

    }



