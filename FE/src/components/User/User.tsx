import { useEffect, useState } from "react";
import { User } from "../../types/user.type";

type Props = {};

const UserPage = (props: Props) => {
  const [users, setUsers] = useState<User[]>([]);

  const fetchData = async () => {
    try {
      const res = await fetch("http://localhost:8080/api/v1/user/get-all");

      if (!res.ok) {
        throw new Error("Call api failed");
      }

      res.json().then((res) => setUsers(res));
    } catch (err) {
      throw err;
    }
  };

  useEffect(() => {
    fetchData();
  }, []);
  return (
    <div>
      {users.map((user) => (
        <div style={{ display: "flex", marginBottom: 5 }}>
          <p style={{ marginRight: 5 }}>{user.id}</p>
          <p style={{ marginRight: 5 }}>{user.username}</p>
          <p style={{ marginRight: 5 }}>{user.password}</p>
        </div>
      ))}
    </div>
  );
};

export default UserPage;
