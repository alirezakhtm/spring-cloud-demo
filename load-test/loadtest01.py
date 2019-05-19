from locust import HttpLocust, TaskSet, task

class WebsiteTasks(TaskSet):
    def on_start(self):
        pass

    @task
    def cif_test(self):
        self.client.get("/cif/cif-information")

    @task
    def lending_test(self):
        self.client.get("/lending/lending-info")

    @task
    def treasury_test(self):
        self.client.get("/treasury/treasuary-info")

    @task
    def ui_test_01(self):
        self.client.get("/ui/cif-all")

    @task
    def ui_test_02(self):
        self.client.get("/ui/treasury-all")

    @task
    def ui_test_03(self):
        self.client.get("/ui/lending-all")

    @task
    def ui_test_04(self):
        self.client.get("/ui/total-info")

class WebsiteUser(HttpLocust):
    task_set = WebsiteTasks
    min_wait = 5000
    max_wait = 15000