package View;

import Model.Turma;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LinhaTabela extends javax.swing.JPanel {

    private int numeroConvertido;
    private JFrame frame;

    public LinhaTabela(Turma turma, JFrame frame) {
        initComponents();
        this.numero.setText(String.valueOf(turma.getNumero()));
        this.nome.setText(turma.getNome());
        this.numeroConvertido = turma.getNumero();
        this.frame = frame;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numero = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        numero.setText("0001");

        nome.setText("Turma Desenvolvimento de Sistemas");

        jButton1.setText("Visualizar");

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(numero)
                .addGap(75, 75, 75)
                .addComponent(nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(numero)
                .addComponent(nome)
                .addComponent(jButton1)
                .addComponent(jButton2))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "DESEJA MESMO DELETAR TURMA?");
        if (opcao == JOptionPane.YES_OPTION) {
            DAO.TurmaDAO.deletarTurma(this.numeroConvertido);
            frame.dispose();
            new HomeProfessor().setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numero;
    // End of variables declaration//GEN-END:variables
}
