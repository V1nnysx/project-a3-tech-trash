package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class QuizForm extends javax.swing.JFrame {

    String[] questions = {"A reciclagem de materiais reduz a necessidade de extrair recursos naturais, como madeira, minerais e petróleo.",
        "O desmatamento é uma das principais causas da perda de biodiversidade.",
        "A poluição do ar causada por emissões de gases tóxicos tem impactos negativos na saúde humana.",
        " A adoção de tecnologias limpas e eficientes é um dos pilares do ODS 12.",
        "A conservação de ecossistemas naturais, como florestas, ajuda a proteger a biodiversidade.",
        "A agricultura intensiva com uso excessivo de agrotóxicos não causa impactos negativos meio ambiente.",
        "A educação ambiental é essencial para conscientizar sobre a importância da preservação do meio ambiente.",
        "A educação ambiental não tem influência na adoção de práticas sustentáveis pela sociedade.",
        "O consumo excessivo de água e energia não tem impacto na disponibilidade desses recursos naturais.",
        "A emissão de gases de efeito estufa não contribui para o aquecimento global.",};
    String[][] options = {{"Verdadeiro.", "Falso.", "Verdadeiro."},
    {"Verdadeiro.", "Falso.", "Verdadeiro."},
    {"Verdadeiro.", "Falso.", "Verdadeiro."},
    {"Verdadeiro.", "Falso.", "Verdadeiro."},
    {"Verdadeiro.", "Falso.", "Verdadeiro."},
    {"Verdadeiro.", "Falso.", "Falso."},
    {"Verdadeiro.", "Falso.", "Verdadeiro."},
    {"Verdadeiro.", "Falso.", "Falso."},
    {"Verdadeiro.", "Falso.", "Falso."},
    {"Verdadeiro.", "Falso.", "Falso."}};
    int index = 0, correct = 0;

    ButtonGroup bg = new ButtonGroup();

    public QuizForm() {
        initComponents();

        setSize(988, 650);

        setLocationRelativeTo(null);

        bg.add(jButtonTrue);
        bg.add(jButtonFalse);

        jButton_Next_QActionPerformed(null);

    }

    public void getSelectedOption(JButton rbtn) {

        // Exibe as respostas corretas/incorretas
        //System.out.println(rbtn.getText());
        //System.out.println(options[index][2]);
        if (rbtn.getText().equals(options[index][2])) {
            correct++;
        }
        index++;
        enableRbuttons(false);
        enableNextbutton(true);
    }

    //Ativa ou desativa os botões após seleção.
    public void enableRbuttons(boolean yes_or_no) {
        jButtonTrue.setEnabled(yes_or_no);
        jButtonFalse.setEnabled(yes_or_no);

    }

    public void enableNextbutton(boolean yes_or_no) {
        jButton_Next_Q.setEnabled(yes_or_no);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonFalse = new javax.swing.JButton();
        jButtonTrue = new javax.swing.JButton();
        jButton_Next_Q = new javax.swing.JButton();
        Lbl_Question = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Lbl_Question1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(988, 560));
        setMinimumSize(new java.awt.Dimension(988, 560));
        setPreferredSize(new java.awt.Dimension(988, 560));
        setResizable(false);
        setSize(new java.awt.Dimension(988, 560));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(77, 167, 105));
        jPanel2.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Tech Trash Logo2.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 20, 240, 225);

        jLabel5.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/qr-code-TechTrash.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 370, 330, 140);

        jLabel6.setFont(new java.awt.Font("Inter", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Escaneie o QR Code e obtenha");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 300, 330, 30);

        jLabel7.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/github-icon.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 520, 330, 40);

        jLabel8.setFont(new java.awt.Font("Inter", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("no GitHub!");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 340, 330, 30);

        jLabel9.setFont(new java.awt.Font("Inter", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("acesso ao nosso repositório");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 320, 330, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 330, 650);

        jPanel3.setBackground(new java.awt.Color(0, 102, 51));
        jPanel3.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TechTrash-Planet.png"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(690, 10, 90, 89);

        jLabel1.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Você sabia?");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(170, 40, 260, 50);

        jLabel4.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("O Brasil é um dos países com as menores  taxas de reciclagem. ");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(170, 70, 620, 80);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(194, 0, 800, 170);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jButtonFalse.setBackground(new java.awt.Color(255, 49, 49));
        jButtonFalse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonFalse.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFalse.setText("Falso!");
        jButtonFalse.setBorder(null);
        jButtonFalse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFalse.setPreferredSize(new java.awt.Dimension(87, 23));
        jButtonFalse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFalseActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonFalse);
        jButtonFalse.setBounds(480, 200, 110, 65);

        jButtonTrue.setBackground(new java.awt.Color(0, 74, 173));
        jButtonTrue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonTrue.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTrue.setText("Verdadeiro!");
        jButtonTrue.setBorder(null);
        jButtonTrue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTrue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrueActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonTrue);
        jButtonTrue.setBounds(61, 204, 110, 65);

        jButton_Next_Q.setText("Próximo...");
        jButton_Next_Q.setBorder(null);
        jButton_Next_Q.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Next_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Next_QActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_Next_Q);
        jButton_Next_Q.setBounds(254, 287, 140, 52);

        Lbl_Question.setBackground(new java.awt.Color(204, 204, 204));
        Lbl_Question.setFont(new java.awt.Font("Inter", 0, 10)); // NOI18N
        Lbl_Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Question.setText("Afirmações aqui!");
        jPanel4.add(Lbl_Question);
        Lbl_Question.setBounds(40, 50, 560, 110);

        jButton1.setText("Sair");
        jButton1.setMaximumSize(new java.awt.Dimension(54, 16));
        jButton1.setMinimumSize(new java.awt.Dimension(54, 16));
        jButton1.setPreferredSize(new java.awt.Dimension(54, 16));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(530, 390, 60, 30);

        Lbl_Question1.setBackground(new java.awt.Color(204, 204, 204));
        Lbl_Question1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        Lbl_Question1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Question1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(115, 200, 131), 3, true));
        jPanel4.add(Lbl_Question1);
        Lbl_Question1.setBounds(30, 50, 580, 110);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(330, 170, 660, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Next_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Next_QActionPerformed

        if (jButton_Next_Q.getText().equals("Refazer o Quiz!")) {
            enableNextbutton(false);
            jButton_Next_Q.setText("Próximo...");
            index = 0;
            correct = 0;
        }

        if (index == questions.length) {

            //Exibe o score do usuário
            Lbl_Question.setText("Parabéns! a sua pontuação é: " + correct + " de " + questions.length + " afirmações!");

            jButton_Next_Q.setText("Refazer o Quiz!");
        } else {
            //Ativa o botão "True" e "False" e desativa o botão "Próximo"
            enableRbuttons(true);
            enableNextbutton(false);

            // Mostra a próxima afirmação
            Lbl_Question.setText(questions[index]);
            jButtonTrue.setText(options[index][0]);
            jButtonFalse.setText(options[index][1]);

            if (index == questions.length - 1) {

                jButton_Next_Q.setText("Última chance!");
            }

        }

        //clear the selection
        bg.clearSelection();
    }//GEN-LAST:event_jButton_Next_QActionPerformed

    private void jButtonTrueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrueActionPerformed
        getSelectedOption(jButtonTrue);
    }//GEN-LAST:event_jButtonTrueActionPerformed

    private void jButtonFalseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFalseActionPerformed
        getSelectedOption(jButtonFalse);
    }//GEN-LAST:event_jButtonFalseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
        new ViewLogin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuizForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Cria o view do Quiz */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Question;
    private javax.swing.JLabel Lbl_Question1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonFalse;
    private javax.swing.JButton jButtonTrue;
    private javax.swing.JButton jButton_Next_Q;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
